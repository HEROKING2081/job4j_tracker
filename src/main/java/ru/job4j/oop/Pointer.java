package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Pointer {

    private int x;
    private int y;

    public Pointer(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Pointer that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Pointer a = new Pointer(0, 0);
        Pointer b = new Pointer(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
