package com.example.jsonplaceholder.model.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Company {
    private String name;
    private String catchPhrase;
    private String bs;
}
