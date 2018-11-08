package com.example.customer.repository;

import com.example.customer.domain.Access;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccessRepository extends MongoRepository<Access, String> {

}