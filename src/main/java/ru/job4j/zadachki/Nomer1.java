package ru.job4j.zadachki;

import java.util.Arrays;

public class Nomer1 {
    public static void main(String[] args) {
        int[] ins1 = {1, 3, 4, 7, 11};
        int[] ins2 = {3, 11, 1, 4};
        int rls1 = Arrays.stream(ins1).sum();
        int rls2 = Arrays.stream(ins2).sum();
        int rls = rls1 - rls2;
        System.out.println(rls);
    }
}
