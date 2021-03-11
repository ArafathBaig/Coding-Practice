package com.StrategyPattern.Client;

import com.StrategyPattern.FlyingBehaviour.IFlyingBehaviour;
import com.StrategyPattern.QuackingBehaviour.IQuackingBehaviour;
import com.StrategyPattern.QuackingBehaviour.SilentQuacking;

public class Duck {

    IFlyingBehaviour flying;
    IQuackingBehaviour quacking;

    public Duck(IFlyingBehaviour flying, IQuackingBehaviour quacking) {
        this.flying = flying;
        this.quacking = quacking;
    }

    public void fly(){
        this.flying.fly();
    }

    public void quack(){
        this.quacking.quack();
    }

    public void displaying(){
        System.out.println("Just displaying the duck.");
    }
}
