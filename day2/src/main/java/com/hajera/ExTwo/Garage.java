package com.hajera.ExTwo;

import com.hajera.ExTwo.Car;

import java.util.ArrayList;
import java.util.List;

public class Garage {
  private Car[] cars;
  private int limit;
  private boolean open;
  private int occupied;

    public Garage( int limit, int occupied, boolean open) {
        this.cars = new Car[limit];
        this.limit = limit;
        this.occupied = occupied;
        this.open = open;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public int getOccupied() {
        return occupied;
    }

    public void setOccupied(int occupied) {
        this.occupied = occupied;
    }
}
