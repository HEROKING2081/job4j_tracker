package ru.job4j.map;

public class Label implements Comparable<Label> {
    private String name;
    private double score;

    @Override
    public int compareTo(Label o) {
        return 0;
    }

    public Label(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
