package com.example.java1.controller;


import com.example.java1.model.Movie;
import com.example.java1.service.MovieService;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/getAllMovies")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/get/{movieID}")
    public Movie getMovie(@PathVariable String movieID) {
        return movieService.getMovie(movieID);
    }

    @PostMapping("/createMovie")
    public Movie createMovie(@RequestBody Movie movie) {
        return movieService.create(movie);
    }

    @DeleteMapping("/deleteMovie/{movieId}")
    public String deleteMovie(@PathVariable String movieId) {
        movieService.delete(movieId);
        return "Movie Deleted";
    }

    @PutMapping("/updateMovie/{movieId}")
    public Movie updateMovie(@RequestBody Movie movie, @PathVariable String movieId) {
        return movieService.update(movie, movieId);
    }

    @DeleteMapping("/deleteAll")
    public String deleteMovies() {
        movieService.deleteAll();
        return "All Movies data deleted";
    }
}
