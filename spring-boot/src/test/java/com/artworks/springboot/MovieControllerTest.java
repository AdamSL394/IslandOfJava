package com.artworks.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.artworks.springboot.controllers.MovieController;
import com.artworks.springboot.repository.MovieRepository;
import com.mongodb.assertions.Assertions;

@SpringBootTest
public class MovieControllerTest {

    @MockBean
    private MovieRepository repository;
    
    @Autowired
    private MovieController controller; 

    @Test
    public void contextLoads(){
        Assertions.assertNotNull(controller);
        Assertions.assertNotNull(repository);
    }

}
