package com.ObservePatternHF.Observer;

import com.ObservePatternHF.Observable.WeatherStation;

public class PhoneDisplay extends Display implements IObserver {

    public PhoneDisplay(WeatherStation weatherStation) {
        super(weatherStation);
    }

    @Override
    public void update() {
        this.getWeatherStation().notifyy();
    }
}
