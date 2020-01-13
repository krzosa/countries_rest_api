package org.krzosa.restful.countries_rest_api.country;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity(name="Currency")
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyEnitity {
    @Id
    @GeneratedValue
    private Integer id;
    private String code;
    private String name;
    private String symbol;
}
