package com.assigment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Movie movie1 = new Movie("HancocK", "Action, Dramma", 92, 6.4);
        Movie movie2 = new Movie("Guardians of the Galaxy", "Action, Adventure", 121, 8.0);
        Movie movie3 = new Movie("The Avengers", "Action, Sci-Fi", 143, 8.0);

        Cinema cinema1 = new Cinema("Chaplin Mega Silk Way", "Kabanbai Batyr, 62");
        Cinema cinema2 = new Cinema("Kinopark 7 IMAX Keruen", "Dostyk, 9");

        System.out.print("Enter name, email and age: ");

        String name = input.next();
        String email = input.next();
        int age = input.nextInt();

        Viewer viewer = new Viewer(name, email, age);

        if (name != null && email != null && age > 0) {
            Cinema.movies.add(movie1.getValues());
            Cinema.movies.add(movie2.getValues());
            Cinema.movies.add(movie3.getValues());

            System.out.println("Select cinema: ");
            System.out.print("1st ");
            System.out.println(cinema1.getCinema());
            System.out.println();
            System.out.print("2nd ");
            System.out.println(cinema2.getCinema());

            System.out.println("1 or 2: ");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Select movie: ");
                cinema1.getMovies();
                System.out.print("Which movie: ");
                int choiceNum = input.nextInt();
                for (int i = 1; i < (Cinema.movies.size()+1); i++) {
                    if (choiceNum == i) {
                        String title;
                        if (i == 1) {
                            title = movie1.getTitle();
                        }
                        else if (i == 2) {
                            title = movie2.getTitle();
                        }
                        else {
                            title = movie3.getTitle();
                        }
                        System.out.println("\nYou have successfully purchased a ticket\n");
                        System.out.println(viewer.getCheck(title, cinema1.getCinema()));

                        break;
                    }
                }
            }
            else if (choice == 2) {
                System.out.println("Select movie: ");
                cinema2.getMovies();
                System.out.print("Which movie: ");
                int choiceNum = input.nextInt();
                for (int i = 1; i < (Cinema.movies.size() + 1); i++) {
                    if (choiceNum == i) {
                        String title;
                        if (i == 1) {
                            title = movie1.getTitle();
                        } else if (i == 2) {
                            title = movie2.getTitle();
                        } else {
                            title = movie3.getTitle();
                        }
                        System.out.println("\nYou have successfully purchased a ticket\n");
                        System.out.println(viewer.getCheck(title, cinema2.getCinema()));

                        break;
                    }
                }
            }
        } else
            System.out.print("Invalid input");

    }
}
