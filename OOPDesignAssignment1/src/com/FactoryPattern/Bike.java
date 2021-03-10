package com.FactoryPattern;

public class Bike implements Vehicle {

    @Override
    public void getVehicleType() {
        System.out.println("This is a Bike.");
    }
}
