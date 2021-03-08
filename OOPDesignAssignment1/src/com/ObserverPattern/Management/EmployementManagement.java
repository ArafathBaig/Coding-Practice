package com.ObserverPattern.Management;

import com.ObserverPattern.DAO.EmployeeDAO;
import com.ObserverPattern.Model.Employee;
import com.ObserverPattern.Observer.IObserver;
import com.ObserverPattern.Subject.ISubject;

import java.util.ArrayList;
import java.util.List;

public class EmployementManagement implements ISubject {

    private List<IObserver> list = new ArrayList<IObserver>();
    private EmployeeDAO service;

    public EmployementManagement(EmployeeDAO service) {
        this.service = service;
    }

    public void addEmployee(Employee employee){
        service.addEmployee(employee);

        notifyObserver();
        System.out.println("Notified about New Employee");
    }

    public void terminateEmployee(int id){

        service.removeEmployee(id);
        notifyObserver();
        System.out.println("Notified about removing the employee");
    }

    @Override
    public void registerObserver(IObserver observer) {
        list.add(observer);
    }

    @Override
    public void notifyObserver() {

        for(IObserver observer : list){
            observer.callme();
        }
    }

    @Override
    public void removeObserver(IObserver observer) {
        list.remove(observer);
    }
}
