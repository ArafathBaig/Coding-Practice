package com.StrategyPattern.FlyingBehaviour;

public class NoFlying implements IFlyingBehaviour {

    @Override
    public void fly() {
        System.out.println("Not Able to Fly");
    }
}
