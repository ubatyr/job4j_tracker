package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String reviews;

    public String getReviews() {
        return reviews;
    }

    public Surgeon(String name, String surname, String education, String birthdey, int experience, String reviews) {
        super(name, surname, education, birthdey, experience);
        this.reviews = reviews;
    }
}

