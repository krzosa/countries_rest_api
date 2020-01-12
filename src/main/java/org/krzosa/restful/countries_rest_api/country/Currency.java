package org.krzosa.restful.countries_rest_api.country;

import javax.persistence.Embeddable;




@Embeddable
public class Currency {
    private String code;
    private String name;
    private String symbol;
}
