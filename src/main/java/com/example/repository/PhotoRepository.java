package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Photo;

public interface PhotoRepository extends MongoRepository<Photo, String>{

}
