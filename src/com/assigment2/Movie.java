package com.assigment2;

import java.util.ArrayList;

public class Movie extends CinemaBody {
    public Movie(String name, String genre, int duration, int ageLimit) {
        super(name);
        this.genre = genre;
        this.duration = duration;
        this.ageLimit = ageLimit;
    }

    private String genre;
    private int duration; // in minutes
    private int ageLimit;
    private ArrayList<String> movie = new ArrayList<>();

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public ArrayList<String> getData() {
        this.movie.add(getName());
        this.movie.add(this.ageLimit + "");
        return this.movie;
    }

    @Override
    public String toString() {
        return "Movie {" +
                "name: '" + super.getName() + "'" +
                ", genre: '" + genre + "'" +
                ", duration: " + duration +
                '}';
    }


}
