package com.example.jsonplaceholder.service;

import com.example.jsonplaceholder.api.JsonplaceholderApi;
import com.example.jsonplaceholder.model.dto.response.JPHUserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SeedService {
    private final JsonplaceholderApi jsonplaceholderApi;

    public List<JPHUserResponse> seedUsers(){
        return jsonplaceholderApi.getusers();
    }
}
