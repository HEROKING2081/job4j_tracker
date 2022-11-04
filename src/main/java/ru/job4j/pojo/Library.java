package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book bible = new Book("Bible", 1568);
        Book threeMusketeers = new Book("Three Musketeers", 668);
        Book robinsonCrusoe = new Book("Robinson Crusoe", 192);
        Book cleanCode = new Book("Clean code", 25);
        Book[] books = new Book[4];
        books[0] = bible;
        books[1] = threeMusketeers;
        books[2] = robinsonCrusoe;
        books[3] = cleanCode;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - "
                    + bk.getPages() + " pages.");
        }
        Book swap = books[0];
        books[0] = books[3];
        books[3] = swap;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.getName().equals("Clean code")) {
                System.out.println("Result = " + bk.getName() + " - "
                        + bk.getPages() + " pages.");
            }
        }
    }
}
