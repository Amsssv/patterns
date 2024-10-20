package com.patterns.creational.builder;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);


        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


         ManualBuilder manualBuilder = new  ManualBuilder();


        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
