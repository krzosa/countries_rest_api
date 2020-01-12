package org.krzosa.restful.countries_rest_api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import lombok.extern.slf4j.Slf4j;
import org.krzosa.restful.countries_rest_api.country.CountryEntity;
import org.krzosa.restful.countries_rest_api.country.CountryRepository;
import org.krzosa.restful.countries_rest_api.country.Currency;
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
        //TODO: fetch data from https://restcountries.eu/rest/v2/all to the database
        try {
            Resource resource = new ClassPathResource("countries.json");
            File file;
            file = resource.getFile();
            Reader reader = new FileReader(file);
            JsonReader jsonReader = new JsonReader(reader);
            Gson gson = new Gson();
            countries = gson.fromJson(jsonReader, CountryEntity[].class);
        }
        catch(Exception e){ log.info("EXCEPTION -> LOADDATABASE.JAVA", e); }
        return args -> {
            for(CountryEntity country : countries){
                repository.save(country);
            }
            log.info("Preloading " + repository.save(CountryEntity.builder().name("Afghanistan").alpha2Code("AD").alpha3Code("AFG")
                .population(1111).build()
            ));
            log.info("Preloading " + repository.save(new CountryEntity("Poland","PL", "POL")));
            log.info("Preloading " + repository.save(new CountryEntity("Polandd","WL", "WOL")));
            log.info("Preloading " + repository.save(new CountryEntity("Polanddd","QL", "QOL")));
            log.info("Preloading " + repository.save(new CountryEntity("Korea","KR", "KOR")));
            log.info("Preloading " + repository.save(new CountryEntity("Test","TT", "TTT")));
        };
    }
}
