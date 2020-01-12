package org.krzosa.restful.countries_rest_api.country;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class CountryEntity {
    @Id
    @GeneratedValue
    private long id;
    private String alpha2Code;
    private String alpha3Code;
    private String capital;
    private String region;
    private String subregion;
    private long population;

}
