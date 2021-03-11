package com.StrategyPattern.SubClients;

import com.StrategyPattern.Client.Duck;
import com.StrategyPattern.FlyingBehaviour.IFlyingBehaviour;
import com.StrategyPattern.QuackingBehaviour.IQuackingBehaviour;

public class WaterDuck extends Duck {

    public WaterDuck(IFlyingBehaviour flying, IQuackingBehaviour quacking) {
        super(flying, quacking);
    }


}
