package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(final List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] in : list) {
            for (int i : in) {
                rsl.add(i);
            }
        }
        return rsl;
    }
}
