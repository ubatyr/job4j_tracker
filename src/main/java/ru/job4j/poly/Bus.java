package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Вы решили ехать?");
    }

    @Override
    public void passengers(int quantity) {
        System.out.println("Сегодня будет 10 пассажиров");
    }

    @Override
    public double price(int fuel) {
        System.out.println("Стоимость поездкаи составит - " + price(fuel));
        return 0;
    }
}
