package com.StrategyPattern.QuackingBehaviour;

public class LoudQuacking implements IQuackingBehaviour{

    @Override
    public void quack() {
        System.out.println("Quacking Loudly.");
    }
}
