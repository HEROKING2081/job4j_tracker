package ru.job4j.encapsulation;

public class Config {

    private String name;
    private int position;
    private String[] properties;

    public Config(final String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(position);
    }

    public String getProperty(final String key) {
        return search(key);
    }

    private String search(final String key) {
        return key;
    }
}
