package com.example.jsonplaceholder.service;

import com.example.jsonplaceholder.model.document.UserDocuments;
import com.example.jsonplaceholder.model.dto.response.JPHUserResponse;
import com.example.jsonplaceholder.repository.UserRepository;
import com.example.jsonplaceholder.utils.converters.UserConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public void saveUser (JPHUserResponse jphUserResponse) {
        UserDocuments userDocuments = UserConverter.convertJPHuserTouserDocuments(jphUserResponse);
        userRepository.save(userDocuments);
    }
    public void saveUserList (List<JPHUserResponse> jphUserResponseList){
        jphUserResponseList.forEach(item -> saveUser(item));
    }
}
