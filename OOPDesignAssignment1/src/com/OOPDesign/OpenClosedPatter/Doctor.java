package com.OOPDesign.OpenClosedPatter;

import com.OOPDesign.Employee.Employee;

public class Doctor extends Employee {

    public Doctor(long id, String name, String department, Boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor Working...");
    }

    @Override
    public void performDuties() {
        checkDiagnosis();
        prescribeMedicine();
    }

    private void checkDiagnosis(){
        System.out.println("Checking diagnosis");
    }

    private void prescribeMedicine(){
        System.out.println("prescribe medicine");
    }
}
