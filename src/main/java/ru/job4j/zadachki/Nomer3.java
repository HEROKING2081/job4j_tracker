package ru.job4j.zadachki;

public class Nomer3 {
    public static void main(String[] args) {
        boolean rls = true;
        String name = "наворован";
        char[] names = name.toCharArray();
        for (int i = 0; i < names.length / 2; i++) {
            if (names[i] != names[names.length - i - 1]) {
                rls = false;
                break;
            }
        }
        System.out.println(rls);
    }
}
