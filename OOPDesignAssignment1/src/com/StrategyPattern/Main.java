package com.StrategyPattern;

import com.StrategyPattern.FlyingBehaviour.JetFlying;
import com.StrategyPattern.FlyingBehaviour.NoFlying;
import com.StrategyPattern.QuackingBehaviour.NormalQuacking;
import com.StrategyPattern.QuackingBehaviour.SilentQuacking;
import com.StrategyPattern.SubClients.LandDuck;
import com.StrategyPattern.SubClients.WaterDuck;

public class Main {
    public static void main(String[] args) {

        WaterDuck waterDuck = new WaterDuck(new NoFlying(), new SilentQuacking());
        LandDuck landDuck = new LandDuck(new JetFlying(), new NormalQuacking());

        waterDuck.fly();
        waterDuck.quack();

        landDuck.fly();
        landDuck.quack();
    }
}
