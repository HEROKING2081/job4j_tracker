package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(final boolean active, final int status, final String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(final String[] args) {
        Error error = new Error();
        error.printInfo();
        Error error404 = new Error(true, 404, "!ERROR! ---> ERROR 404");
        error404.printInfo();
        Error noterror = new Error(false, 100, "Error not detected! Happines!");
        noterror.printInfo();
    }
}
