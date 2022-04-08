package com.example.jsonplaceholder.repository;

import com.example.jsonplaceholder.model.document.UserDocuments;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserDocuments,String> {
}
