package com.ObserverPattern.Subject;

import com.ObserverPattern.Observer.IObserver;

public interface ISubject {
    public void registerObserver(IObserver observer);
    public void notifyObserver();
    public void removeObserver(IObserver observer);
}
