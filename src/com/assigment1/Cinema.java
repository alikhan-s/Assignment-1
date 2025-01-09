package com.assigment1;

import java.util.ArrayList;

public class Cinema {
    private String name;
    private String address;
    public static ArrayList<String> movies = new ArrayList<>();

    public Cinema(String name, String address) {
        setValues(name, address);
    }

    public void setValues(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getCinema() {
        return "Cinema: " + name + " " + address;
    }

    public void getMovies() {
        System.out.println("Movies:");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println((i+1) + ". " + movies.get(i));
        }
    }

}
