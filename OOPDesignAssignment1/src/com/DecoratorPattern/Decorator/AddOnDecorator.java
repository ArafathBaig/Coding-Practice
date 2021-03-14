package com.DecoratorPattern.Decorator;

import com.DecoratorPattern.Component.Beverages;

public abstract class AddOnDecorator extends Beverages {

    public abstract int cost();
}
