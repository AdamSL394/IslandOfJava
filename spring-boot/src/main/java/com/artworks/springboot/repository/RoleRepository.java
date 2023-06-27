package com.artworks.springboot.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.artworks.springboot.models.Role;
import com.artworks.springboot.models.ERole;

public interface RoleRepository extends MongoRepository <Role,String> {
    Optional<Role> findByName(ERole name);
    
}
