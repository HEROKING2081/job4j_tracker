package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {

    private static String tomato = "-Tomato";

    @Override
    public String name() {
        return super.name() + tomato;
    }
}
