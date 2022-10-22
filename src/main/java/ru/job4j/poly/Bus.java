package ru.job4j.poly;

public class Bus implements Transport{
    @Override
    public void drive() {
    }

    @Override
    public void passengers(int passengers) {
        System.out.println(passengers + " passengers in bus.");
    }

    @Override
    public int refuel(int oil) {
        return oil * 46;
    }
}
