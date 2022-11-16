package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class ExampleMatch {
    public static void main(String[] args) {
        List<String> strings1 = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        boolean rsl1 = strings1
                .stream() // запускаем поток из элементов листа strings
                .noneMatch("Шесть"::contains); // проверяем, что такой элемент отсутствует в потоке
        System.out.println(rsl1); // true

        boolean rsl2 = strings1
                .stream() // запускаем поток из элементов листа strings
                .anyMatch(e -> e.endsWith("ь")); // проверяем, что хотя бы один элемент потока оканчивается на "ь"
        System.out.println(rsl2); // true

        List<String> strings2 = Arrays.asList("Трижды", "Три", "Триста", "Три тысячи");
        boolean rsl3 = strings2
                .stream() // запускаем поток из элементов листа strings
                .allMatch(e -> e.startsWith("Три")); // проверяем, что все элементы потока начинаются с "Три"
        System.out.println(rsl3); // true
    }
}
