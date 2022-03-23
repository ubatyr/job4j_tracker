package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String clinics;

    public String getClinics() {
        return clinics;
    }

    public Dentist(String name, String surname, String education, String birthdey, int experience, String clinics) {
        super(name, surname, education, birthdey, experience);
        this.clinics = clinics;
    }
}
