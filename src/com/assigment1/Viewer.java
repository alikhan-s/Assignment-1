package com.assigment1;

public class Viewer {
    private String name;
    private String email;
    private int age;

    public Viewer(String name, String email, int age) {
        setValues(name, email, age);
    }

    public void setValues(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getValues() {
        return "Name: " + name + "\nEmail: " + email;
    }

    public String getCheck(String title, String cinema) {
        String res = cinema + "\n" + getValues();

        return res + "Date: 09.01.2025\nMovie: " + title + "\nTime: 2:30 \nSeat: Hall 3, Row 5, Seat 8 \nPrice: $5.00";
    }

}
