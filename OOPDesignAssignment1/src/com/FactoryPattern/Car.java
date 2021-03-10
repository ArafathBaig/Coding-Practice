package com.FactoryPattern;

public class Car implements Vehicle {

    @Override
    public void getVehicleType() {
        System.out.println("This is a Car.");
    }
}
