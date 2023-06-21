package com.artworks.springboot;

import java.util.List;
import java.util.HashMap;

import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin(origins = "http://localhost:3000")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping("/all")
        public ResponseEntity<List<Movie>> allMovies(){
            return new ResponseEntity<List<Movie>>(movieService.getAllMovies(), HttpStatus.OK);
        }

    @GetMapping("/id/{id}")
        public ResponseEntity<Movie> getMoviebyId(@PathVariable("id") ObjectId id){
        return new ResponseEntity<Movie>(movieService.getMovie(id), HttpStatus.OK);

    }

    @DeleteMapping("remove/id/{id}")
        public void deleteMovieById(@PathVariable("id") ObjectId id){
            movieService.deleteMovieById(id);
            return;
        }

    @PostMapping("create")
        public void createMovie(@RequestBody Movie movie) {
            movieService.createMovie(movie);
        }

    @PutMapping("update/{id}")
        public void updateMovie(@PathVariable("id") ObjectId id, @RequestBody Movie movieName) {
            movieService.updateMovie(id,movieName);
        }

        @GetMapping("/chatgpt")
        public ResponseEntity<String> callOpenAi(@RequestBody HashMap<String,String> question){
            System.out.println("dsfsd");
        return new ResponseEntity<String>(movieService.callChatGpt(question), HttpStatus.OK);

    }
}
