package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String code;

    public String getCode() {
        return code;
    }

    public Programmer(String name, String surname, String education, String birthdey, String courses, String code) {
        super(name, surname, education, birthdey, courses);
        this.code = code;
    }
}

