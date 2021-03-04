package com.OOPDesign.OpenClosedPatter;

import com.OOPDesign.Employee.Employee;

public class EmergencyRoomProcess {
    public static void main(String[] args) {
        HospitalManagament hm = new HospitalManagament();
        Employee nurse = new Nurse(1,"Hiii","Nurse",true);
        hm.performDuties(nurse);

        Employee doctor = new Doctor(1,"Byeee","Doctor",true);
        hm.performDuties(doctor);


    }
}
