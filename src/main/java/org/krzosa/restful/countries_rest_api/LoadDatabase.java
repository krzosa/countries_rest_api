package org.krzosa.restful.countries_rest_api;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.krzosa.restful.countries_rest_api.country.CountryEntity;
import org.krzosa.restful.countries_rest_api.country.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

@Configuration
public class LoadDatabase {
    CountryEntity[] countries;

    Logger logger = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(CountryRepository repository){
        try {
            String data = "";
            Resource resource = new ClassPathResource("static/countries.json");
            byte[] bdata = FileCopyUtils.copyToByteArray(resource.getInputStream());
            data = new String(bdata, StandardCharsets.UTF_8);

            Gson gson = new Gson();
            countries = gson.fromJson(data, CountryEntity[].class);
        }
        catch(Exception e){ logger.info("EXCEPTION -> LOADDATABASE.JAVA", e); }

        return args -> {
            for(CountryEntity country : countries)
                logger.info("Saving: " + repository.save(country));
        };
    }
}
