package com.BuilderPattern.Model;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle.Builder()
                .price(100.00)
                .type("car")
                .make("Honda")
                .horsePower(150)
                .model("Accord")
                .color("red")
                .door(4).build();

        System.out.println(vehicle);
    }
}
