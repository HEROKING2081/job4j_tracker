package ru.job4j.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.*;
import java.util.stream.IntStream;

public class ExampleMin {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 1, 3, 2);
        Optional<Integer> minEl = list.stream() // запускаем поток элементов Integer
                .min(Comparator.naturalOrder()); // вычисляем минимальный элемент и передаем компаратор сравнения по возрастанию
        System.out.println(minEl.get()); // получаем значение из Optional

        OptionalInt min = IntStream
                .rangeClosed(1, 5) // запускаем поток int от 1 до 5 включительно
                .min(); // отбираем минимальный элемент
        System.out.println(min.getAsInt()); // получаем значение из OptionalInt
    }
}
