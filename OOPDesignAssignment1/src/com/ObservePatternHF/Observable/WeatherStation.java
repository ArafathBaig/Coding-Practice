package com.ObservePatternHF.Observable;

import com.ObservePatternHF.Observer.IObserver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WeatherStation implements  IObservable{

    private List<IObserver> observers;
    private int temprature;

    public WeatherStation(){
        observers = new ArrayList<>();
    }

    @Override
    public void add(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        Iterator<IObserver> iterator = observers.iterator();

        while(iterator.hasNext()){
            IObserver currentObserver = iterator.next();

            if(currentObserver == observer){
                iterator.remove();
            }
        }
    }

    @Override
    public void notifyy() {

        for(IObserver observer : observers){
            observer.update();
        }
    }

    public int getTemprature(){
        return this.temprature;
    }

}
