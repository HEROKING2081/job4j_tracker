package ru.job4j.stream;

import java.util.*;

public class ExampleCount {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        long sum = nums.stream() // запускаем поток из объектов Integer
                .filter(el -> el % 2 == 0) // отбираем только четные числа
                .count(); // получаем количество элементов в потоке
        System.out.println(sum);
    }
}
