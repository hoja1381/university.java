package com.hoja;

public class Main {

    public static void main(String[] args) {
        Car car = CarFactory.geCar(Car.GMC);
        System.out.println(car.carInfo());
    }
}
