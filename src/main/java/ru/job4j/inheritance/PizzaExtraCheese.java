package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {

    private static String cheese = "-Cheese";

    @Override
    public String name() {
        return super.name() + cheese;
    }
}
