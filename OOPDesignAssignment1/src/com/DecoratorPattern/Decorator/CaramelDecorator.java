package com.DecoratorPattern.Decorator;

import com.DecoratorPattern.Component.Beverages;

public class CaramelDecorator extends AddOnDecorator {
    private Beverages beverages;

    public CaramelDecorator(Beverages beverages){
        this.beverages = beverages;
    }
    @Override
    public int cost() {
        return this.beverages.cost() + 3;
    }
}
