package com.StrategyPattern.QuackingBehaviour;

public class NormalQuacking implements IQuackingBehaviour{

    @Override
    public void quack() {
        System.out.println("Quacking normally.");
    }
}
