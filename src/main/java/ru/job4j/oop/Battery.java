package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(final int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void exchange(final Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }
}
