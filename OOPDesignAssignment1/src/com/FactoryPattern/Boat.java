package com.FactoryPattern;

public class Boat implements Vehicle {

    @Override
    public void getVehicleType() {
        System.out.println("This is a Boat.");
    }
}
