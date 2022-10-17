package ru.job4j.oop;

public class Dog {

    public void gav() {
        System.out.println("Gav gav gav");
    }
    public static void main(String[] args) {
        Dog polkan = new Dog();
        Dog sharik = new Dog();
        Dog zhuchka = new Dog();
        polkan.gav();
        sharik.gav();
        zhuchka.gav();
    }
}
