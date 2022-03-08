package com.example.jsonplaceholder.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class JsonPlaceholderController
{
    @PostMapping("/World")
    public String teste(){
        return "Hello";
    }
}
