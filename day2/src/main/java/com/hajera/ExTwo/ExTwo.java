package com.hajera.ExTwo;

public class ExTwo {
    public static void main(String[] args) {
        Car carOne = new Car(CarMake.AUDI, "Audi TT", "AB123 CDE");
        Garage garageOne = new Garage(carOne, 20.00);

        System.out.println(garageOne.car.getMake());
    }
}
