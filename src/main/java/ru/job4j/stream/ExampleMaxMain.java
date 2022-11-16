package ru.job4j.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ExampleMaxMain {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Михаил", 35),
                new Person("Ольга", 26),
                new Person("Антон", 20),
                new Person("Виктор", 16),
                new Person("Анна", 29)
        );
        Optional<Person> youngestPerson = people.stream() // запускаем поток объектов Person
                .max(Comparator.comparing(Person::getAge)); // получаем объект с максимальным возрастом
        int age = youngestPerson.get().getAge(); // получаем возраст этого человека
        System.out.println(age);
    }
}
