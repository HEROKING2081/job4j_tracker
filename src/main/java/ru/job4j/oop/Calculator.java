package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumAllOperation(int c) {
        return sum(c) + multiply(c) + minus(c) + divide(c);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int rslMinus = minus(12);
        System.out.println(rslMinus);
        Calculator divide = new Calculator();
        int rslDivide = divide.divide(25);
        System.out.println(rslDivide);
        Calculator rslAll = new Calculator();
        int sumAll = rslAll.sumAllOperation(10);
        System.out.println(sumAll);
    }
}
