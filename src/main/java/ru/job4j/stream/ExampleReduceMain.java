package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class ExampleReduceMain {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Михаил", 15),
                new Person("Михаил", 35),
                new Person("Ольга", 26),
                new Person("Антон", 20),
                new Person("Виктор", 16),
                new Person("Анна", 29)
        );
        int sum = people.stream() // запускаем поток из элементов Person
                .reduce(
                        0, // задаем стартовое значение, к которому будет происходить суммирование
                        (a, b) -> { // в этом блоке применяем промежуточную операцию по отбору людей с возрастом > 25
                            if (b.getAge() > 25) {
                                return a + b.getAge();
                            } else {
                                return a;
                            }
                        },
                        Integer::sum // получаем сумму всех элементов с помощью указанного BinaryOperator
                );
        System.out.println(sum);
    }
}
