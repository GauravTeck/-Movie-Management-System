package org.cfs.movieproject.repository;

import jakarta.annotation.PostConstruct;
import org.cfs.movieproject.entity.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MovieRepository {

    private final Map<Long, Movie> movieDb = new HashMap<>();

    public MovieRepository() {


        System.out.println(" default MovieRepository");
    }

    @PostConstruct
    public void loadDummyData(){

        System.out.println(" loading DummyData");
        movieDb.put(1L,new Movie(1L,"KGF","Action",9.8,2022,"Hindi"));
        movieDb.put(2L,new Movie(2L,"Pushpa","Action",9.2,2023,"Tamil"));
        movieDb.put(3L,new Movie(3L,"Toxic","Action Drama",6.8,2022,"Telugu"));
        movieDb.put(4L,new Movie(4L,"Evil Dead","SC-Fi",8.8,2010,"English"));
    }

    // Get All Movies
    public List<Movie> getAllMovies() {

        return new ArrayList<>(movieDb.values());
    }

    // Get Movie By ID
    public Movie getMovieById(Long id) {
        return movieDb.get(id);
    }

    // Save Movie
    public Movie saveMovie(Movie movie) {
        movieDb.put(movie.getId(), movie);
        return movie;
    }

    // Search Movie By Name
    public List<Movie> searchByName(String name) {

        List<Movie> movieList = new ArrayList<>();

        for (Movie collection : movieDb.values()) {

            if (collection.getName() != null &&
                    collection.getName().toLowerCase()
                            .contains(name.toLowerCase())) {

                movieList.add(collection);
            }
        }

        return movieList;
    }
}