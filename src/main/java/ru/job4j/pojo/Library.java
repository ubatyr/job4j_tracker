package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Kolobok", 8);
        Book second = new Book("Pinocchio", 15);
        Book third = new Book("Pushkin 's poems", 250);
        Book fourth = new Book("Clean code", 25);
        Book[] array = new Book[4];
        array[0] = first;
        array[1] = second;
        array[2] = third;
        array[3] = fourth;
        for (int index = 0; index < array.length; index++) {
            Book rsl = array[index];
            System.out.println(rsl.getName() + " - " + rsl.getPages());
        }
        System.out.println("replace point 0 and 3");
        Book temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        for (int index = 0; index < array.length; index++) {
            Book rsl = array[index];
            System.out.println(rsl.getName() + " - " + rsl.getPages());
        }
        System.out.println("Only book - Clean code");
        for (int index = 0; index < array.length; index++) {
            Book rsl = array[index];
            if (rsl.getName() == "Clean code") {
                System.out.println(rsl.getName() + " - " + rsl.getPages());
            }
        }
    }
}
