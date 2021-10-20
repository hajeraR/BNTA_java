package com.hajera.ExTwo;

import com.hajera.ExTwo.Car;

public class Garage {
     Car car;
    private double charge;

    public Garage (Car car, double charge){
        this.car = car;
        this.charge = charge;
    }




    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }
}
