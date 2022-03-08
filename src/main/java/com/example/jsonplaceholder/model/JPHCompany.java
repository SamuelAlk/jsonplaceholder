package com.example.jsonplaceholder.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class JPHCompany {
    private String name;
    private String catchPhrase;
    private String bs;
}
