package com.FactoryPattern;

public class Truck implements Vehicle {

    @Override
    public void getVehicleType() {
        System.out.println("This is a truck.");
    }
}
