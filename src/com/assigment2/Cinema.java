package com.assigment2;

import java.util.ArrayList;
import java.util.Random;

public class Cinema extends CinemaBody implements iTicketBooking {
    public Cinema(String name, String location) {
        super(name);
        this.location = location;
}

    private String location;
    private Random random = new Random();

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Cinema {" +
                "name: '" + super.getName() + "'" +
                ", location: '" + location + "'" +
                '}';
    }

    @Override
    public String bookTicket(ArrayList<String> movie, boolean check) {

        return "Cinema: " + super.getName() +
                "\nLocation: " + location +
                "\nMovie: " + movie.get(0) +
                "\nDate: 15.01.2025" +
                "\nTime: " + (13 + random.nextInt(6)) + ":00\n" +
                "Hall: " + (1 + random.nextInt(1)) +
                "\nRow: " + (1 + random.nextInt(11)) + ", Seat: " + (1 + random.nextInt(11)) +
                "\n\nTicket Price: $10.00";
    }
}
