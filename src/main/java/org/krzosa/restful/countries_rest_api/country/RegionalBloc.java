package org.krzosa.restful.countries_rest_api.country;

import javax.persistence.Embeddable;
import java.util.ArrayList;
import java.util.List;

@Embeddable
public class RegionalBloc {
    private String acronym;
    private String name;
    private List<String> otherAcronyms = new ArrayList<>();
    private List<String> otherNames  = new ArrayList<>();
}
