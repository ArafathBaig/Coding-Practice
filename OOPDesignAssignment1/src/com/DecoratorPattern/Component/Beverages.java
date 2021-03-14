package com.DecoratorPattern.Component;

public abstract class Beverages {

    public abstract int cost();

    public void description(){
        System.out.println("A order for Beverage taken in.");
    }
}
