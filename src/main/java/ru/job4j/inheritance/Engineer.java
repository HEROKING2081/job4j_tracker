package ru.job4j.inheritance;

public class Engineer extends Profession {

    private int experience;

    public Engineer(final int experience, final boolean degree) {
        super(degree);
        this.experience = experience;
    }
}
