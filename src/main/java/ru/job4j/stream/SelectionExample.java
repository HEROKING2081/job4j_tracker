package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class SelectionExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        List<String> rsl1 = strings
                .stream() // запускаем поток из элементов листа strings
                .skip(2) // пропускаем первые 2 элемента
                .toList(); // собираем в лист
        System.out.println(rsl1);

        List<String> rsl2 = strings
                .stream() // запускаем поток из элементов листа strings
                .limit(3) // оставляем только первые 3 элемента
                .toList(); // собираем в лист
        System.out.println(rsl2);

        List<String> rsl3 = strings
                .stream() // запускаем поток из элементов листа strings
                .skip(2) // пропускаем 2 первых элемента
                .limit(2) // из получившегося потока оставляем только первые 2 элемента
                .toList(); // собираем в лист
            System.out.println(rsl3);

        String rsl4 = strings
                .stream() // запускаем поток из элементов листа strings
                .skip(2) // пропускаем 2 первых элемента
                .limit(2) // из получившегося потока оставляем только первые 2 элемента
                .findFirst() // получаем первый элемент из получившегося потока (тип Optional)
                .orElse("По умолчанию"); // получаем значение из Optional, а если его нет, то значение по умолчанию
        System.out.println(rsl4);

        String rsl5 = strings
                .stream() // запускаем поток из элементов листа strings
                .skip(5) // пропускаем 5 первых элементов = все
                .findFirst() // будет получен пустой Optional, так как поток пуст
                .orElse("По умолчанию"); // получаем значение по умолчанию, так как findFirst() не вернул актуальное значение
        System.out.println(rsl5);

        String rsl6 = strings
                .stream() // запускаем поток из элементов листа strings
                .skip(strings.size() - 1) // пропускаем "размер коллекции - 1" элементов
                .findFirst() // получаем первый элемент из получившегося потока
                .orElse("По умолчанию"); // получаем значение из Optional, а если его нет, то значение по умолчанию
        System.out.println(rsl6);
    }
}
