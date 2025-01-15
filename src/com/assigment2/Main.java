package com.assigment2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Creating instances of each class
        Movie movie1 = new Movie("The Amazing Spider-man 2", "Action", 142, 14);
        Movie movie2 = new Movie("Guardians of the Galaxy", "Sci-Fi", 121, 16);
        Movie movie3 = new Movie("Fight Club", "Drama", 139, 18);

        Viewer viewer1 = new Viewer("Alimzhan", 15);
        Viewer viewer2 = new Viewer("Baqytzhan", 24);
        Viewer viewer3 = new Viewer("Alikhan", 17);

        Cinema cinema1 = new Cinema("Chaplin Mega Silk Way", "Kabanbai Batyr, 62");
        Cinema cinema2 = new Cinema("Kinopark 7 IMAX Keruen", "Dostyk, 9");

        // TicketBooking
        System.out.println(cinema2.bookTicket(movie3.getData(), viewer2.checkAge(movie3.getAgeLimit())));
        System.out.println();

        // Display instances
//        System.out.println(movie1);
//        System.out.println(movie2);
//        System.out.println(movie3);
//        System.out.println(viewer1);
//        System.out.println(viewer2);
//        System.out.println(viewer3);
//        System.out.println(cinema1);
//        System.out.println(cinema2);
//        System.out.println();

        // Comparing objects
//        System.out.println("Is movie1 equal to movie2? " + movie1.equals(movie2));
//        System.out.println("Is movie2 equal to movie3? " + movie2.equals(movie3));
//        System.out.println("Is movie1 equal to movie3? " + movie1.equals(movie3));
//        System.out.println();

        // Data pool with sorting and filtering
        CinemaBody.filterByName(movie1, movie2, movie3);
    }
}
