package org.krzosa.restful.countries_rest_api.country;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "country")
public class CountryEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String alpha3Code;
    private String alpha2Code;
    private String capital;
    private String name;
    private Integer population;
    private String region;
    private String subregion;
    @ElementCollection
    private List<String> topLevelDomain = new ArrayList<>();
    @ElementCollection
    private List<String> callingCodes = new ArrayList<>();
    @ElementCollection
    private List<String> altSpellings = new ArrayList<>();
    @ElementCollection
    private List<String> timezones = new ArrayList<>();
    @ElementCollection
    private List<String> languages = new ArrayList<>();

    public CountryEntity(String name, String alpha2Code, String alpha3Code) {
        this.name = name;
        this.alpha2Code = alpha2Code;
        this.alpha3Code = alpha3Code;
    }
}


