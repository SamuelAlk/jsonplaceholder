package com.example.jsonplaceholder.api;

import com.example.jsonplaceholder.api.feign.JsonplaceholderFeing;
import com.example.jsonplaceholder.model.dto.response.JPHUserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class JsonplaceholderApi {
    private final JsonplaceholderFeing jsonplaceholderFeing;
//    @Autowired
//    private JsonplaceholderFeing jsonplaceholderFeing;
    public List<JPHUserResponse> getusers(){
        return jsonplaceholderFeing.getusers();

    }
}
