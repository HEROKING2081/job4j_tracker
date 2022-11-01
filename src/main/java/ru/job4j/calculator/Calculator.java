package ru.job4j.calculator;

public class Calculator {

    public double add(final double first, final double second) {
        return first + second;
    }

    public double add(final double first, final double second, final double third) {
        return add(
                first,
                add(second, third)
        );
    }


}
