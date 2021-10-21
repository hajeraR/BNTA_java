package com.hajera.ExTwo;

public class CarGarageService {

    public static boolean getCars(Garage garage, Car car){
        if (garage.getOccupied()+1 <= garage.getLimit()){
            Car[] cars = garage.getCars(); //the empty array will equal the cars in the garage
            cars[garage.getOccupied()] = car; // set a specific index equal to a car input
            int occupied = garage.getOccupied(); //let current occupied number be number of cars
            garage.setOccupied(++occupied); //increment occupied number
            return true;
        }
        return false;
    }
}
