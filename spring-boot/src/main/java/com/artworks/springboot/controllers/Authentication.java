package com.artworks.springboot.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artworks.springboot.models.Movie;
import com.artworks.springboot.repository.RoleRepository;
import com.artworks.springboot.repository.UserRepository;
import com.artworks.springboot.security.jwt.JwtUtils;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3000")

public class Authentication {
    
   @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  UserRepository userRepository;

  @Autowired
  RoleRepository roleRepository;

  @Autowired
  PasswordEncoder encoder;

  @Autowired
  JwtUtils jwtUtils;

     @PostMapping("/signup")
        public void createUser(@RequestBody Movie movie) {

        }

     @PostMapping("/signin")
        public void authenticateUser(@RequestBody Movie movie) {
      //    Authentication authentication = authenticationManager.authenticate(
      //   new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
        }
}
