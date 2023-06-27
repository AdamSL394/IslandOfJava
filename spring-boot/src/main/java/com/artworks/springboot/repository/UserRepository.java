package com.artworks.springboot.repository;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.artworks.springboot.models.User;


public interface UserRepository extends MongoRepository<User,String> {
    Optional<User> findByUserName(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

}
