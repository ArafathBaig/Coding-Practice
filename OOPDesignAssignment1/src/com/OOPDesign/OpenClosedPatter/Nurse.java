package com.OOPDesign.OpenClosedPatter;

import com.OOPDesign.Employee.Employee;

public class Nurse extends Employee {

    public Nurse(long id, String name, String department, Boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse Is working...");
    }

    @Override
    public void performDuties() {
        checkVitals();
        checkTemp();
    }

    private void checkVitals(){
        System.out.println("Check Vitals");
    }

    private void checkTemp(){
        System.out.println("check temprature");
    }


}
