package com.example.jsonplaceholder.api.feign;

import com.example.jsonplaceholder.model.dto.response.JPHUserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
@FeignClient(name="Jsonplaceholderfeingbean",url="https://jsonplaceholder.typicode.com")
public interface JsonplaceholderFeing {
    @GetMapping("/users")
    List<JPHUserResponse> getusers();
}
