package ru.job4j.oop;

public class Calculator {

    private static  int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int y, int a, int b, int c) {
        return sum(y) + multiply(a) + minus(b) + divide(c);
    }

    public static void main(String[] args) {
        int resultSum = sum(10);
        System.out.println(resultSum);
        Calculator calculator = new Calculator();
        int resultMultiply = calculator.multiply(5);
        System.out.println(resultMultiply);
        int resultMinus = minus(15);
        System.out.println(resultMinus);
        Calculator div = new Calculator();
        int resultDivide = div.divide(10);
        System.out.println(resultDivide);
        int result = resultSum + resultMultiply + resultMinus + resultDivide;
        System.out.println(result);

    }
}
