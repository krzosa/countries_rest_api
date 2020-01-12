package org.krzosa.restful.countries_rest_api.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    private final CountryRepository repository;

    @Autowired
    CountryController(CountryRepository repository, CountryQueries queries){
        this.repository = repository;
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
    List<CountryEntity> requestCountryByName(@PathVariable(name="name") String countryName){
        countryName = countryName.trim().toLowerCase();
        return repository.findByCountryName(countryName);
    }
    @GetMapping("/rest/alpha/{code}")
    List<CountryEntity> requestCountryByAlphaCode(@PathVariable(name="code") String code){
        code = code.trim().toLowerCase();
        return repository.findByCountryAlphaCodes(code);
    }

//    @GetMapping("/rest/{nameOrCode}")
//    List<CountryEntity> requestCountryByNameOrAlphaCode(@PathVariable(name="nameOrCode") String name){
//        name = name.trim().toLowerCase();
//    }

}
