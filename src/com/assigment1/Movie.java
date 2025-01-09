package com.assigment1;

public class Movie {
    private String title;
    private String genre;
    private int duration;
    private double rating;

    public Movie(String title, String genre, int duration, double rating) {
        setValues(title, genre, duration, rating);
    }

    public void setValues(String title, String genre, int duration, double rating) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
    }

    public String getValues() {
        return "Title: " + title + ", Genre: " + genre + "\nDuration: " + duration + ", Rating: " + rating;
    }

    public String getTitle() {
        return title;
    }

}
