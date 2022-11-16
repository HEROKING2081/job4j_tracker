package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class ExampleMapToInt {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5"); // создаем лист строковых значений (объекты)
        strings.stream() // запускаем поток из строк
                .mapToInt(Integer::parseInt) // преобразуем поток String в поток int
                .filter(e -> e % 2 == 0) // отбираем числа, делящиеся на 2
                .forEach(System.out::println); // выводим полученные числа на печать
    }
}
