package org.cfs.movieproject.entity;

public class Movie {

    private Long id ;
    private String name ;
    private String genre;
    private Double rating ;
    private Integer year ;
    private String language ;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }



    public Movie(){

    }

    public Movie(Long id, String name, String genre,
                 Double rating, Integer year, String language) {

        this.id = id;
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.year = year;
        this.language = language;
    }

}
