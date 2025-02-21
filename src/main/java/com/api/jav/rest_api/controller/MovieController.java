package com.api.jav.rest_api.controller;

import com.api.jav.rest_api.dto.MovieDTO;
import com.api.jav.rest_api.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
	
	@Autowired
    private MovieService movieService;

    // Get all movies
	@GetMapping   
    public ResponseEntity<List<MovieDTO>> getAllMovies() {
        List<MovieDTO> movies = movieService.getAllMovies();
        return ResponseEntity.ok(movies);
    }

    // Get a product by ID
    @GetMapping("/{id}")
    public ResponseEntity<MovieDTO> getMovieById(@PathVariable int id) {
    	MovieDTO movie = movieService.getMovieById(id);
        return ResponseEntity.ok(movie);
    }

    // Create a new product
    @PostMapping
    public ResponseEntity<MovieDTO> createMovie(@RequestBody MovieDTO movieDTO) {
    	MovieDTO createdMovie = movieService.createMovie(movieDTO);
        return ResponseEntity.ok(createdMovie);
    }

    // Update a product
    @PutMapping("/{id}")
    public ResponseEntity<MovieDTO> updateMovie(@PathVariable int id, @RequestBody MovieDTO movieDTO) {
    	MovieDTO updatedMovie = movieService.updateMovie(id, movieDTO);
        return ResponseEntity.ok(updatedMovie);
    }

    // Delete a product
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable int id) {
    	movieService.deleteMovie(id);
        return ResponseEntity.noContent().build();
    }

}
