package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointerTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Pointer a = new Pointer(0, 0);
        Pointer b = new Pointer(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when50to22then2() {
        double expected = 3.6;
        Pointer a = new Pointer(5, 0);
        Pointer b = new Pointer(2, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when83to11then2() {
        double expected = 7.28;
        Pointer a = new Pointer(8, 3);
        Pointer b = new Pointer(1, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when05to56then2() {
        double expected = 5.1;
        Pointer a = new Pointer(0, 5);
        Pointer b = new Pointer(5, 6);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}