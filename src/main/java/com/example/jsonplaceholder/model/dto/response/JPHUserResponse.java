package com.example.jsonplaceholder.model.dto.response;

import com.example.jsonplaceholder.model.JPHAddress;
import com.example.jsonplaceholder.model.JPHCompany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class JPHUserResponse {
    private String id;
    private String name;
    private String username;
    private String email;
    private JPHAddress address;
    private String phone;
    private String website;
    private JPHCompany company;

}
