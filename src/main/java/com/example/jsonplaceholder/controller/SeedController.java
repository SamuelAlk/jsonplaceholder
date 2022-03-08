package com.example.jsonplaceholder.controller;

import com.example.jsonplaceholder.model.dto.response.JPHUserResponse;
import com.example.jsonplaceholder.service.SeedService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seed")
@RequiredArgsConstructor
public class SeedController {
    private final SeedService seedService;
    @PostMapping("/users")
    public ResponseEntity<List<JPHUserResponse>> seedUsers(){
        List<JPHUserResponse> userResponses=seedService.seedUsers();
        return new ResponseEntity<List<JPHUserResponse>>(userResponses,HttpStatus.NO_CONTENT);
    }
}
