package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class ExamplePeek {
    public static void main(String[] args) {
        List<StringBuilder> names = Arrays.asList(
                new StringBuilder("Михаил"), new StringBuilder("Иван"), new StringBuilder("Елена")); // создаем лист объектов
        List<StringBuilder> editedNames = names
                .stream()
                .peek((el) -> el.append(" (Myченик Job4j)"))
                .sorted()
                .toList();
        System.out.println(editedNames);
    }
}
