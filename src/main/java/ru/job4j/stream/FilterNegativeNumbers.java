package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class FilterNegativeNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-8, -4, -2, 0, 1, 3, 9);
        List<Integer> positive = numbers.stream()
                .filter(integer -> integer > 0)
                .toList();
        positive.forEach(System.out::println);
    }
}
