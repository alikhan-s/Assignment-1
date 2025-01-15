package com.assigment2;

public class Viewer extends CinemaBody {
    public Viewer(String name, int age) {
        super(name);
        this.age = age;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean checkAge(int ageLimit) {
        if (this.age >= ageLimit)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Viewer {" +
                "name: '" + super.getName() + "'" +
                ", age: " + age +
                '}';
    }
}
