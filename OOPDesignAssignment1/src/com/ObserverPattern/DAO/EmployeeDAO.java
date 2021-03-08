package com.ObserverPattern.DAO;

import com.ObserverPattern.Model.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDAO {

    private static List<Employee> list = new ArrayList<>();

    static {
        list.add(new Employee("Arafath"));
        list.add(new Employee("Baig"));
    }

    public void addEmployee(Employee newEmployee){
        list.add(newEmployee);
    }

    public void removeEmployee(int id){

        Iterator<Employee> iterator = list.iterator();

        while(iterator.hasNext()){
            Employee emp = iterator.next();
            if(id == emp.getId()){
                iterator.remove();
                return;
            }
        }
    }
}
