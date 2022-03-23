package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String courses;

    public String getCourses() {
        return courses;
    }

    public Engineer(String name, String surname, String education, String birthdey, String courses) {
        super(name, surname, education, birthdey);
        this.courses = courses;
    }
}

