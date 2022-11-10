package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {

    private final ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        Predicate<Person> findByName = (person) -> person.getName().contains(key);
        Predicate<Person> findBySurname = (person) -> person.getSurname().contains(key);
        Predicate<Person> findByPhone = (person) -> person.getPhone().contains(key);
        Predicate<Person> findByAddress = (person) -> person.getAddress().contains(key);
        Predicate<Person> def = findByAddress.or(findByName.or(findByPhone.or(findBySurname)));
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            if (def.test(person)) {
                result.add(persons.get(i));
            }
        }
        return result;
    }
}
