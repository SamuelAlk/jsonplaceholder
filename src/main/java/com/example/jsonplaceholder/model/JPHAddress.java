package com.example.jsonplaceholder.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class JPHAddress {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private JPHGeo geo;
}
