package com.ObserverPattern.Observer;

public class PayrollDepartment implements IObserver{

    @Override
    public void callme() {
        System.out.println("Payroll Department: got called");
    }
}
