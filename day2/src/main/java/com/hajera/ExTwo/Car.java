package com.hajera.ExTwo;

public class Car {
    private CarMake make;
    private String model;
    private String plateNumber;

public Car (CarMake make, String model, String plateNumber){
    this.make = make;
    this.model = model;
    this.plateNumber = plateNumber;
}

    public CarMake getMake() {
        return make;
    }

    public void setMake(CarMake make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }




}
