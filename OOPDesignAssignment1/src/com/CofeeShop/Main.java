package com.CofeeShop;

import com.CofeeShop.Subject.CoffeeAttendee;

public class Main {
    public static void main(String[] args) {
        CoffeeAttendee ca = new CoffeeAttendee();
        ca.takeOrder();
        ca.prepareOrder();
    }
}
