package com.ObservePatternHF.Observable;

import com.ObservePatternHF.Observer.IObserver;

public interface IObservable {

    public void add(IObserver observer);
    public void remove(IObserver observer);
    public void notifyy();
}
