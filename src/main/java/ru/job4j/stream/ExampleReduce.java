package ru.job4j.stream;

import java.util.List;
import java.util.Optional;

public class ExampleReduce {
    public static void main(String[] args) {
        List<Integer> nums1 = List.of(1, 2, 3, 4);
        Optional<Integer> sum1 = nums1.stream() // запускаем поток из элементов Integer
                .reduce(Integer::sum); // сводим поток к единому значению (сумме) с помощью указанного BinaryOperator
        System.out.println(sum1.get()); // получаем значение из Optional

        List<String> nums2 = List.of("Один", "Два", "Три");
        Optional<String> sum2 = nums2.stream() // запускаем поток из элементов String
                .reduce((a, b) -> a + ", " + b); // соединяем поток строк в единую строку
        System.out.println(sum2.get()); // получаем значение из Optional

        int sum3 = nums1.stream() // запускаем поток из элементов Integer
                .reduce(2, Integer::sum); // получаем сумму всех элементов с помощью указанного BinaryOperator
        System.out.println(sum3);
    }
}
