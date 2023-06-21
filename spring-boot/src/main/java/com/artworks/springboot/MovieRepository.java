package com.artworks.springboot;

import org.bson.types.ObjectId;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    // void updateOne(ObjectId movieId, Movie movie);
    
}

