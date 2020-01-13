package org.krzosa.restful.countries_rest_api.country;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Language {

    @Id
    @GeneratedValue
    private Integer id;
    private String iso639_1;
    private String iso639_2;
    private String name;
    private String nativeName;

}
