package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String objects;

    public String getObjects() {
        return objects;
    }

    public Builder(String name, String surname, String education, String birthdey, String courses, String objects) {
        super(name, surname, education, birthdey, courses);
        this.objects = objects;
    }
}
