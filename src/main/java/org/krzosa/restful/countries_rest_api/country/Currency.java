package org.krzosa.restful.countries_rest_api.country;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;




@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class Currency {
    private String code;
    private String name;
    private String symbol;
}
