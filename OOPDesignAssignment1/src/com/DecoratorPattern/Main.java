package com.DecoratorPattern;

import com.DecoratorPattern.Decorator.CaramelDecorator;
import com.DecoratorPattern.Decorator.WhipCreamDecorator;
import com.DecoratorPattern.Model.Coffee;

public class Main {
    public static void main(String[] args) {

        Coffee coffee = new Coffee();

        coffee.includeAddOns(new WhipCreamDecorator(coffee));
        coffee.includeAddOns(new CaramelDecorator(coffee));

        System.out.println(coffee.cost());
    }
}
