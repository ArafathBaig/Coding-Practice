package com.CofeeShop.Observer;

public class Customer implements WaitingCustomer {

    private String name;
    private String drinkOrdered;

    public Customer(String name, String drinkOrdered) {
        this.name = name;
        this.drinkOrdered = drinkOrdered;
    }

    @Override
    public void takeOrder() {
        System.out.println("Order of " + drinkOrdered + " has been added.");
    }

    @Override
    public void orderReady() {
        System.out.println("Mr." + this.name + ", You order of " + this.drinkOrdered + " is ready.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrinkOrdered() {
        return drinkOrdered;
    }

    public void setDrinkOrdered(String drinkOrdered) {
        this.drinkOrdered = drinkOrdered;
    }
}
