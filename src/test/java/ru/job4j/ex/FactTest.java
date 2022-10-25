package ru.job4j.ex;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import junit.framework.TestCase;

public class FactTest extends TestCase {

    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Fact().calc(-1);
                });
        assertThat(exception.getMessage()).isEqualTo("N could not be less then 0");
    }

}