package com.ObserverPattern.Observer;

public class HRDepartment implements IObserver {

    @Override
    public void callme() {
        System.out.println("HR Department: Got the Call");
    }
}
