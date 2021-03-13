package com.ObservePatternHF.Observer;

import com.ObservePatternHF.Observable.WeatherStation;

public class Display {

    private WeatherStation weatherStation;

    public Display(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void display(){
        System.out.println("The temprature is " + this.weatherStation.getTemprature());
    }

    public WeatherStation getWeatherStation() {
        return weatherStation;
    }

    public void setWeatherStation(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }
}
