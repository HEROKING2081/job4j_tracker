package ru.job4j.stream;

import java.util.*;

public class ExampleSum {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Михаил", 35),
                new Person("Ольга", 26),
                new Person("Антон", 20),
                new Person("Виктор", 16),
                new Person("Анна", 29)
        );
        int sum = people.stream() // запускаем поток объектов Person
                .mapToInt(Person::getAge) // преобразуем поток типа Person в поток типа int
                .sum(); // суммируем возраст всех людей в списке
        System.out.println(sum);
    }
}
