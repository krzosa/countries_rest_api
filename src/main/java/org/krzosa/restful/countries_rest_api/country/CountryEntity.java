package org.krzosa.restful.countries_rest_api.country;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Country")
public class CountryEntity {
    @Id
    @GeneratedValue
    private Long id;
    private Double area;
    private String alpha3Code;
    private String alpha2Code;
    private String capital;
    private String demonym;
    private Double gini;
    private String name;
    private String nativeName;
    private String numericCode;
    private Integer population;
    private String region;
    private String subregion;

    @ElementCollection
    private List<String> altSpellings;
    @ElementCollection
    private List<String> callingCodes;
    @ElementCollection
    private List<Double> latlng;
    @ElementCollection
    private List<String> topLevelDomain;
    @ElementCollection
    private List<String> timezones;

    @OneToMany
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<CurrencyEnitity> currencies;

    @OneToMany
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<LanguageEnitity> languages;

    @OneToMany
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<RegionalBlocEntity> regionalBlocs;
}


