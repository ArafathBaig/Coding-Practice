package com.StrategyPattern.QuackingBehaviour;

public class SilentQuacking implements IQuackingBehaviour{

    @Override
    public void quack() {
        System.out.println("Quacking Silently.");
    }
}
