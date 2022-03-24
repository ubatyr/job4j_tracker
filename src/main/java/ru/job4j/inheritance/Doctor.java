package ru.job4j.inheritance;

public class Doctor extends Profession {
    private int experience;

    public Doctor(String name, String surname, String education, String birthdey, int experience) {
        super(name, surname, education, birthdey);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}

