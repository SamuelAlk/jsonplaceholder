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
    private final UserService userService;
    public List<JPHUserResponse> seedUsers(){
        List<JPHUserResponse> list = jsonplaceholderApi.getusers();
        userService.saveUserList(list);
        return list;
    }
}
