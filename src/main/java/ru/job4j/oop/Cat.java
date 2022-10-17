package ru.job4j.oop;

public class Cat {

    public void myau() {
        System.out.println("Мяу мяу мяу");
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        peppy.myau();
        sparky.myau();
    }
}
