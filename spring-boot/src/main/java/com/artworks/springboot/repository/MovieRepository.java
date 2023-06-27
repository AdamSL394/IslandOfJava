package com.artworks.springboot.repository;

import org.bson.types.ObjectId;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.artworks.springboot.models.Movie;


@Repository

public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    // void updateOne(ObjectId movieId, Movie movie);
    
}

