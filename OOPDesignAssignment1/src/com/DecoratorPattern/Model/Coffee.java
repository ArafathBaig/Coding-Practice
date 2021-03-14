package com.DecoratorPattern.Model;

import com.DecoratorPattern.Component.Beverages;
import com.DecoratorPattern.Decorator.AddOnDecorator;

import java.util.ArrayList;
import java.util.List;

public class Coffee extends Beverages {

    private int cost;
    private List<AddOnDecorator> addOns;
    public Coffee(){
        cost = 1;
        this.addOns = new ArrayList<>();
    }

    @Override
    public int cost() {
        return cost;
    }

    public void includeAddOns(AddOnDecorator extraAddOn){
        addOns.add(extraAddOn);
        cost = extraAddOn.cost();
    }

}
