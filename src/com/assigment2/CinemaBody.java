package com.assigment2;

import java.util.*;

public abstract class CinemaBody {
    public CinemaBody(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void filterByName(Movie movie1, Movie movie2, Movie movie3) {
        List<Movie> movies = Arrays.asList(movie1, movie2, movie3);
        System.out.println("Filtering by duration and sorting by title: ");
        movies.stream()
                .filter(movie -> movie.getDuration() > 130)
                .sorted(Comparator.comparing(Movie::getName))
                .forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "CinemaBody { name = '" + name + "' }";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        CinemaBody that = (CinemaBody) object;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}