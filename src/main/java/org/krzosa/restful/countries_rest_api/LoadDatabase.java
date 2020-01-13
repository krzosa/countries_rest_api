package org.krzosa.restful.countries_rest_api;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import lombok.extern.slf4j.Slf4j;
import org.krzosa.restful.countries_rest_api.country.CountryEntity;
import org.krzosa.restful.countries_rest_api.country.CountryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

@Configuration
@Slf4j
public class LoadDatabase {
    CountryEntity[] countries;

    @Bean
    CommandLineRunner initDatabase(CountryRepository repository){
        try {
            Resource resource = new ClassPathResource("countries.json");
            File file = resource.getFile();
            Reader reader = new FileReader(file);

            Gson gson = new Gson();
            countries = gson.fromJson(reader, CountryEntity[].class);
        }
        catch(Exception e){ log.info("EXCEPTION -> LOADDATABASE.JAVA", e); }

        return args -> {
            for(CountryEntity country : countries)
                log.info("Saving: " + repository.save(country));
        };
    }
}
