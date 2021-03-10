package com.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vf = new VehicleFactory();

        Vehicle vehicle = vf.getVehicle(VehicleType.BIKE);
        vehicle.getVehicleType();
    }
}
