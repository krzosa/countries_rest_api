package org.krzosa.restful.countries_rest_api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.krzosa.restful.countries_rest_api.country.CountryEntity;
import org.krzosa.restful.countries_rest_api.country.CountryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

@Configuration
@Slf4j
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(CountryRepository repository){
        //TODO: fetch data from https://restcountries.eu/rest/v2/all to the database

        return args -> {
            log.info("Preloading " + repository.save(CountryEntity.builder().name("Afghanistan").alpha2Code("AD").alpha3Code("AFG")
                .languages(new ArrayList<String>(Arrays.asList("Pashto"))).population(1111).build()
            ));
            log.info("Preloading " + repository.save(new CountryEntity("Poland","PL", "POL")));
            log.info("Preloading " + repository.save(new CountryEntity("Polandd","WL", "WOL")));
            log.info("Preloading " + repository.save(new CountryEntity("Polanddd","QL", "QOL")));
            log.info("Preloading " + repository.save(new CountryEntity("Korea","KR", "KOR")));
            log.info("Preloading " + repository.save(new CountryEntity("Test","TT", "TTT")));
        };
    }
}
