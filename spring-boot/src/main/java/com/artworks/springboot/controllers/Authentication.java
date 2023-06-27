package com.artworks.springboot.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.artworks.springboot.models.Movie;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3000")

public class Authentication {
    

     @PostMapping("/signup")
        public void createUser(@RequestBody Movie movie) {

        }

     @PostMapping("/signin")
        public void authenticateUser(@RequestBody Movie movie) {

        }
}
