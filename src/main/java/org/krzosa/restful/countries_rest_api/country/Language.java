package org.krzosa.restful.countries_rest_api.country;

import javax.persistence.Embeddable;

@Embeddable
public class Language {
    private String iso639_1;
    private String iso639_2;
    private String name;
    private String nativeName;
}
