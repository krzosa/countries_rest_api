package org.krzosa.restful.countries_rest_api.country;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CountryQueries extends Repository<CountryEntity,Long> {


}
