package ru.job4j.zadachki;

public class Nomer2 {
    public static void main(String[] args) {
        for (int x = 1; x <= 100; x++) {
            if (x % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (x % 3 == 0) {
                System.out.println("Fizz");
            } else if (x % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(x);
            }
        }
    }
}
