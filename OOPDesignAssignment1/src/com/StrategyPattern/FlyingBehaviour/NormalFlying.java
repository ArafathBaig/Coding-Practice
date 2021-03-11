package com.StrategyPattern.FlyingBehaviour;

public class NormalFlying implements IFlyingBehaviour {

    @Override
    public void fly() {
        System.out.println("Flying at a normal speed");
    }
}
