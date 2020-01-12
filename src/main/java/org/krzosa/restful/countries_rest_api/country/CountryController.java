package org.krzosa.restful.countries_rest_api.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    private final CountryRepository repository;
    private final CountryQueries queries;

    @Autowired
    CountryController(CountryRepository repository, CountryQueries queries){
        this.repository = repository;
        this.queries = queries;
    }

    @GetMapping("/rest/all")
    List<CountryEntity> requestAll(){
        return repository.findAll();
    }

    @PostMapping("/rest/all")
    CountryEntity newCountry(@RequestBody CountryEntity country){
        return repository.save(country);
    }

    @GetMapping("/rest/name/{name}")
    List<CountryEntity> requestCountry(@PathVariable String countryName){
        return queries.findByCountryName(countryName);
    }

}
