package com.example.jsonplaceholder.model.document;

import com.example.jsonplaceholder.model.JPHAddress;
import com.example.jsonplaceholder.model.JPHCompany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
@Document(collection="user")
public class UserDocuments {
    @Id
    private String id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;
}
