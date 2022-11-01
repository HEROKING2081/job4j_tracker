package ru.job4j.pojo;

public class Book {

    private String name;
    private int pages;

    public Book(final String name, final int pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(final int pages) {
        this.pages = pages;
    }
}
