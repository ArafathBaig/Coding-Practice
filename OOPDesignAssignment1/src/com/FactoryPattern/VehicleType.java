package com.FactoryPattern;

public enum VehicleType {
    TRUCK{
        public Vehicle getVehicle(){
            return new Truck();
        }
    }, CAR {
        public Vehicle getVehicle(){
            return new Car();
        }
    }, BIKE{

        public Vehicle getVehicle(){
            return new Bike();
        }

    }, BOAT{
        public Vehicle getVehicle(){
            return new Boat();
        }
    };

    abstract  Vehicle getVehicle();
}
