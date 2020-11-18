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

    public Movie() {}

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public int getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(int movieImage) {
        this.movieImage = movieImage;
    }

}
