package ru.job4j.oop;

public class Error {
    private boolean active;
    public int status;
    public String message;

    public Error() {
        active = false;
        status = 11;
        message = "No Good";
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error first = new Error();
        Error second = new Error(true, 55, "Good");
        Error three = new Error(true, 150, "OK");
        first.printInfo();
        second.printInfo();
        three.printInfo();
    }
}
