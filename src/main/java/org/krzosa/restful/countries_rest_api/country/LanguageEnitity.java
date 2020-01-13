package org.krzosa.restful.countries_rest_api.country;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity(name="Language")
@NoArgsConstructor
@AllArgsConstructor
public class LanguageEnitity {

    @Id
    @GeneratedValue
    private Integer id;
    private String iso639_1;
    private String iso639_2;
    private String name;
    private String nativeName;

}
