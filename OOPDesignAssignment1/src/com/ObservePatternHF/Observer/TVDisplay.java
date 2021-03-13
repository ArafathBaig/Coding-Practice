package com.ObservePatternHF.Observer;

import com.ObservePatternHF.Observable.WeatherStation;

public class TVDisplay extends Display implements IObserver {

    public TVDisplay(WeatherStation weatherStation) {
        super(weatherStation);
    }

    @Override
    public void update() {
        this.getWeatherStation().notifyy();
    }
}
