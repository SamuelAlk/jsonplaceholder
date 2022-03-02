package com.example.jsonplaceholder.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class JasonPlaceholderController
{
    @PostMapping("/World")
    public String teste(){
        return "Hello";
    }
}
