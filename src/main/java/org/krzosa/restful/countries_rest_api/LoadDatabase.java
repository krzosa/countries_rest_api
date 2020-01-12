package org.krzosa.restful.countries_rest_api;

import lombok.extern.slf4j.Slf4j;
import org.krzosa.restful.countries_rest_api.country.CountryEntity;
import org.krzosa.restful.countries_rest_api.country.CountryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(CountryRepository repository){
//        Logger test = LoggerFactory.getLogger(LoadDatabase.class);
        return args -> {
            log.info("Preloading " + repository.save(new CountryEntity("Poland","PL")));  
            log.info("Preloading " + repository.save(new CountryEntity("Korea","KR")));
        };
    }
}
