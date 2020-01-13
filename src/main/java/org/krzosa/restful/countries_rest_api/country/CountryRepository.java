package org.krzosa.restful.countries_rest_api.country;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends CrudRepository<CountryEntity, Long> {
    @Query("select c from Country c where lower(c.name) like concat('%', :name, '%')")
    List<CountryEntity> findByCountryName(@Param("name") String name);
    @Query("select c from Country c where lower(c.alpha2Code) like :code or lower(c.alpha3Code) like :code")
    List<CountryEntity> findByCountryAlphaCodes(@Param("code") String code);

    //standard CRUD operations
    <S extends CountryEntity> S save(S s);
    Optional<CountryEntity> findById(Long aLong);
    List<CountryEntity> findAll();
    void deleteById(Long aLong);
}
