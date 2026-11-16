package org.cfs.movieproject.controller;

import org.cfs.movieproject.entity.Movie;
import org.cfs.movieproject.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getMovies();
    }

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable Long id){
        return movieService.getMovie(id);
    }

    @GetMapping("/search")
    public List<Movie> searchMovieByName(@RequestParam String name){
        return movieService.searchByName(name);
    }

    @PostMapping
    public Movie addMovie(Movie movie){
       return movieService.addMovie(movie);
    }


}
