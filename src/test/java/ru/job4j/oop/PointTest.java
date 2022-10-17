package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when50to22then2() {
        double expected = 3.6;
        Point a = new Point(5, 0);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when83to11then2() {
        double expected = 7.28;
        Point a = new Point(8, 3);
        Point b = new Point(1, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when05to56then2() {
        double expected = 5.1;
        Point a = new Point(0, 5);
        Point b = new Point(5, 6);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}