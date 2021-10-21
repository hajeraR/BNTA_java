package com.hajera.ExTwo;

public class ExTwo {
    public static void main(String[] args) {


            Car carOne = new Car(CarMake.AUDI, "Audi TT", "AB123 CDE");
            Car carTwo = new Car(CarMake.FORD, "Model2", "FG456 HIJ");
            Car[] cars =  {carOne, carTwo};


//            System.out.println(carOne);
//            System.out.println(carTwo);

            Garage garageOne = new Garage(20, 0, true);
            CarGarageService carGarageService = new CarGarageService();

            for (Car car: cars) {
                boolean result = CarGarageService.getCars(garageOne, carOne);
                System.out.println(result);
            }










    }
}
