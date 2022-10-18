package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

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
    public void when50to22then36() {
        double expected = 3.6;
        Point a = new Point(5, 0);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when83to11then728() {
        double expected = 7.28;
        Point a = new Point(8, 3);
        Point b = new Point(1, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when05to56then51() {
        double expected = 5.1;
        Point a = new Point(0, 5);
        Point b = new Point(5, 6);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when050to568then948() {
        double expected = 9.48;
        Point a = new Point(0, 5, 0);
        Point b = new Point(5, 6, 8);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when777to272then707() {
        double expected = 7.07;
        Point a = new Point(7, 7, 7);
        Point b = new Point(2, 7, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when585to666then245() {
        double expected = 2.45;
        Point a = new Point(5, 8, 5);
        Point b = new Point(6, 6, 6);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}