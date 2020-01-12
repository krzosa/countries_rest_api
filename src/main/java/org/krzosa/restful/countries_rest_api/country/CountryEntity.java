package org.krzosa.restful.countries_rest_api.country;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;


/*
* [{"alpha2Code": "AF", "alpha3Code": "AFG", "area": 652230, "callingCodes": ["93"], "capital": "Kabul",
* "currencies": [{"code": "AFN", "name": "Afghan afghani", "symbol": "\u060b"}],
* "demonym": "Afghan", "flag": "https://restcountries.eu/data/afg.svg",
* "gini": 27.8, "latlng": [33, 65],
* "name": "Afghanistan", "nativeName": "\u0627\u0641\u063a\u0627\u0646\u0633\u062a\u0627\u0646",
* "numericCode": "004", "population": 27657145, "region": "Asia",
* "regionalBlocs": [{"acronym": "SAARC", "name": "South Asian Association for Regional Cooperation"}], "subregion": "Southern Asia",
* "timezones": ["UTC+04:30"], "topLevelDomain": [".af"], "cioc": "AFG"},
 * */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "country")
public class CountryEntity {
    @Id
    @GeneratedValue
    private Long id;
    private Integer area;
    private String alpha3Code;
    private String alpha2Code;
    private String capital;
    private String name;
    private String nativeName;
    private String numericCode;
    private Integer population;
    private String region;
    private String subregion;
    private String demonym;
    private String flag;
    private Double gini;
    @ElementCollection
    private List<RegionalBloc> RegionalBlocs = new ArrayList<>();
    @ElementCollection
    private List<Double> latlng = new ArrayList<>();
    @ElementCollection
    private List<String> topLevelDomain = new ArrayList<>();
    @ElementCollection
    private List<String> callingCodes = new ArrayList<>();
    @ElementCollection
    private List<String> altSpellings = new ArrayList<>();
    @ElementCollection
    private List<String> timezones = new ArrayList<>();
    @ElementCollection
    private List<Currency> currencies = new ArrayList<>();

    public CountryEntity(String name, String alpha2Code, String alpha3Code) {
        this.name = name;
        this.alpha2Code = alpha2Code;
        this.alpha3Code = alpha3Code;
    }
}


