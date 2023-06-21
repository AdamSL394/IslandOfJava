package com.artworks.springboot;

import java.util.HashMap;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {

    private MovieRepository movieRepository;

    private MongoTemplate mongoTemplate;

    public MovieService(MovieRepository movieRepo, MongoTemplate mongoTemplate){
        this.movieRepository = movieRepo;
        this.mongoTemplate = mongoTemplate;
    }

    public Movie getMovie(ObjectId movieId){
        return movieRepository.findById(movieId).orElseThrow();
    }

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public void deleteMovieById(ObjectId movieId) {
         movieRepository.deleteById(movieId);
         return;
    }

    public void createMovie(Movie movie) {
        movieRepository.insert(movie);
        return;
    }

    public void updateMovie(ObjectId id, Movie movie){
        Query movieToUpdate = Query.query(Criteria.where("id").is(id));
		mongoTemplate.updateFirst(movieToUpdate, Update.update("name", movie.getName()), Movie.class);
    }

    public String callChatGpt(HashMap<String,String> question){
        System.out.println();
        try {
            String url = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=mcFEgDJvSerB0MXK50KOkvJ2HPpbzVqtV6r3Cgv6";
            RestTemplate callChatEndpoint = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            // headers.setContentType(MediaType.APPLICATION_JSON);
            // headers.setBearerAuth("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");
            HttpEntity<HashMap<String, String>> entity = new HttpEntity<>(question, headers);
    
            String result = callChatEndpoint.getForObject(url,String.class);
    
            return result;
            
        } catch (Exception e) {
            System.out.print("Error Message: " + e);
        }
        return "Hello";
    }
    
}
