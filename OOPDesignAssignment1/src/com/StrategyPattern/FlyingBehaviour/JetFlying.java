package com.StrategyPattern.FlyingBehaviour;

public class JetFlying implements IFlyingBehaviour {

    @Override
    public void fly() {
        System.out.println("Flying at a greater speed.");
    }
}
