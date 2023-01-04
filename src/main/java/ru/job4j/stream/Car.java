package ru.job4j.stream;

import java.time.LocalDate;

public class Car {
    private String brand;

    private String model;

    private LocalDate created;

    private double volume;

    private String color;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", created=" + created +
                ", volume=" + volume +
                ", color='" + color + '\'' +
                '}';
    }

    static class Builder {
        private String brand;
        private String model;
        private LocalDate created;
        private double volume;
        private String color;

        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildCreated(LocalDate created) {
            this.created = created;
            return this;
        }

        Builder buildVolume(double volume) {
            this.volume = volume;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.brand = brand;
            car.model = model;
            car.created = created;
            car.volume = volume;
            car.color = color;
            return car;
        }
    }

    public static void main(String[] args) {
        Car car = new Builder()
                .buildBrand("Toyota")
                .buildModel("Camry")
                .buildCreated(LocalDate.of(2021, 6, 1))
                .buildVolume(3.5)
                .buildColor("Red")
                .build();
        System.out.println(car);

        Car car1 = new Builder()
                .buildBrand("LADA")
                .buildModel("Vesta")
                .buildCreated(LocalDate.of(2018, 3, 19))
                .buildVolume(1.6)
                .buildColor("Gray")
                .build();
        System.out.println(car1);

        Car car2 = new Builder()
                .buildBrand("Porsche")
                .buildModel("911")
                .buildCreated(LocalDate.of(2020, 9, 3))
                .buildVolume(3.2)
                .buildColor("Black")
                .build();
        System.out.println(car2);
    }
}