package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox one = new Jukebox();
        Jukebox two = new Jukebox();
        Jukebox tree = new Jukebox();
        int song1 = 1;
        int song2 = 2;
        int notSong = 34;
        one.music(song1);
        two.music(song2);
        tree.music(notSong);
    }
}
