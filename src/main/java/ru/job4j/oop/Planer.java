package ru.job4j.oop;

public class Planer implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " in the air");
    }
}
