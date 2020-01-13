package org.krzosa.restful.countries_rest_api.country;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name="RegionalBloc")
@NoArgsConstructor
@AllArgsConstructor
public class RegionalBlocEntity {

    @Id
    @GeneratedValue
    private Integer id;
    private String acronym;
    private String name;
    @ElementCollection
    private List<String> otherAcronyms;
    @ElementCollection
    private List<String> otherNames;

}
