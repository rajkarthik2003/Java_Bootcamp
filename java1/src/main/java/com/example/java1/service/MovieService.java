package com.example.java1.service;

import com.example.java1.model.Movie;
import com.example.java1.repository.MovieRepository; // Assuming there is a MovieRepository
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovie(String movieID) {
        return movieRepository.findById(movieID).orElse(null);
    }

    public Movie create(Movie movie) {
        return movieRepository.save(movie);
    }

    public void delete(String movieId) {
        movieRepository.deleteById(movieId);
    }

    public Movie update(Movie movie, String movieId) {
        Movie movie1 = movieRepository.findById(movieId).orElse(null);
        if (movie1 != null) {
            movie1.setTitle(movie.getTitle());
            movie1.setDirector(movie.getDirector());
            movieRepository.save(movie1);
        }
        return movie1;
    }

    public void deleteAll() {
        movieRepository.deleteAll();
    }
}
