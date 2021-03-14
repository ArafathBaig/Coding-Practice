package com.DecoratorPattern.Decorator;

import com.DecoratorPattern.Component.Beverages;

public class WhipCreamDecorator extends AddOnDecorator{

    private Beverages beverages;

    public WhipCreamDecorator(Beverages beverages){
        this.beverages = beverages;
    }
    @Override
    public int cost() {
        return this.beverages.cost() + 2;
    }
}
