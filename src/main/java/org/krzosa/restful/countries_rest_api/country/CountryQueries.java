package org.krzosa.restful.countries_rest_api.country;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CountryQueries extends Repository<CountryEntity,Long> {
    @Query("Select c from CountryEntity c where c.name = :name")
    List<CountryEntity> findByCountryName(String name);

}
