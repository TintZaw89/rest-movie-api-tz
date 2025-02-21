package com.api.jav.rest_api.service;

import com.api.jav.rest_api.entity.Movie;
import com.api.jav.rest_api.dto.MovieDTO;
import com.api.jav.rest_api.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRespository;
	
	// Convert Movie entity to MovieDTO
    private MovieDTO mapToDTO(Movie movie) {
        return new MovieDTO(movie.getMovieId(),movie.getMovieName(),movie.getDirector(),movie.getPrice(),
        		movie.getMovieCategory(),movie.getStatus(),movie.getGenre(),movie.getYear(),movie.getQuantity());
    }

    // Convert MovieDTO to Movie entity
    private Movie mapToEntity(MovieDTO movieDTO) {
        return new Movie(movieDTO.getMovieName(), movieDTO.getDirector(), movieDTO.getPrice(),movieDTO.getMovieCategory(),
        		movieDTO.getStatus(),movieDTO.getGenre(),movieDTO.getYear(),movieDTO.getQuantity());
    }

    // Get all movies
    public List<MovieDTO> getAllMovies() {
       
			return movieRespository.findAll().stream()
			        .map(this::mapToDTO)
			        .collect(Collectors.toList());
    }

    // Get a single movie by ID
    public MovieDTO getMovieById(Integer id) {
        Movie movie = movieRespository.findById(id).orElseThrow(() -> new RuntimeException("Movie not found"));
        return mapToDTO(movie);
    }

    // Create a new movie
    public MovieDTO createMovie(MovieDTO movieDTO) {
        Movie movie = mapToEntity(movieDTO);
        Movie savedMovie = movieRespository.save(movie);
        return mapToDTO(savedMovie);
    }

    // Update an existing movie
    public MovieDTO updateMovie(int id, MovieDTO movieDTO) {
        Movie existingMovie = movieRespository.findById(id).orElseThrow(() -> new RuntimeException("Movie not found"));
        existingMovie.setDirector(movieDTO.getDirector());
        existingMovie.setMovieName(movieDTO.getMovieName());
        existingMovie.setPrice(movieDTO.getPrice());
        existingMovie.setStatus(movieDTO.getStatus());
        existingMovie.setGenre(movieDTO.getGenre());
        existingMovie.setYear(movieDTO.getYear());
        existingMovie.setQuantity(movieDTO.getQuantity());
        Movie updatedMovie = movieRespository.save(existingMovie);
        return mapToDTO(updatedMovie);
    }

    // Delete a movie
    public void deleteMovie(int id) {
        Movie movie = movieRespository.findById(id).orElseThrow(() -> new RuntimeException("Movie not found"));
        movieRespository.delete(movie);
    }

}
