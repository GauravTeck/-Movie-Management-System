package org.cfs.movieproject.service;

import org.cfs.movieproject.entity.Movie;
import org.cfs.movieproject.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getMovies() {

        return  movieRepository.getAllMovies();
    }

    public Movie getMovie(Long  id) {
        return movieRepository.getMovieById(id);
    }

    public Movie addMovie(Movie movie ) {

        return movieRepository.saveMovie(movie);
    }

    public List<Movie> searchByName(String name){

        return movieRepository.searchByName(name);
    }


}
