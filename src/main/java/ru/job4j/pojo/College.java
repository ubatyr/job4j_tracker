package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan Ivanov");
        student.setTeam("A01");
        student.setDate("01.09.2000");
        System.out.println(student.getName() + ", class - " + student.getTeam() + ", start date of study - " + student.getDate());
    }
}
