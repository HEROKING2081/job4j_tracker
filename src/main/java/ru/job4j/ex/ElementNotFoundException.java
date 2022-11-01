package ru.job4j.ex;

public class ElementNotFoundException extends Exception {

    public static int indexOf(final String[] value, final String key)
            throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException();
        }
        return rsl;
    }

    public static void main(final String[] args) {
        try {
            String[] words = {"Mouse", "Dog", "Cat", "Pig"};
            indexOf(words, "Horse");
            System.out.println(indexOf(words, "efj"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
