package com.example.custommovieadapter.models;

public class Movie {

    private String movieTitle;
    private String movieRating;
    private String movieDescription;
    private int movieImage;

    public Movie(String movieTitle, String movieRating, String movieDescription, int movieImage) {
        this.movieTitle = movieTitle;
        this.movieRating = movieRating;
        this.movieDescription = movieDescription;
        this.movieImage = movieImage;
    }

}
