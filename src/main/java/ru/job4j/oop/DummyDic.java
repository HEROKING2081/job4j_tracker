package ru.job4j.oop;

public class DummyDic {

    public String engToRus(final String eng) {
        String rls = "Неизвестное слово. " + eng;
        return rls;
    }

    public static void main(final String[] args) {
        DummyDic rus = new DummyDic();
        String say = rus.engToRus("HH.RU");
        System.out.println(say);
    }
}
