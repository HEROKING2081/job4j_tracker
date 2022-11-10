package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionCalculatorTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenLinearFunctionThenLinearResulTwo() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(3, 9, x -> x * x);
        List<Double> expected = Arrays.asList(9D, 16D, 25D, 36D, 49D, 64D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenLinearFunctionThenLinearResultsTree() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(4, 7, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(16D, 32D, 64D);
        assertThat(result).containsAll(expected);
    }
}