package com.ObserverPattern;

import com.ObserverPattern.DAO.EmployeeDAO;
import com.ObserverPattern.Management.EmployementManagement;
import com.ObserverPattern.Model.Employee;
import com.ObserverPattern.Observer.HRDepartment;
import com.ObserverPattern.Observer.PayrollDepartment;

public class App {
    public static void main(String[] args) {

        HRDepartment hr = new HRDepartment();
        PayrollDepartment payroll = new PayrollDepartment();

        EmployeeDAO service = new EmployeeDAO();
        EmployementManagement emp = new EmployementManagement(service);

        emp.registerObserver(hr);
        emp.registerObserver(payroll);

        emp.addEmployee(new Employee("John"));
        emp.terminateEmployee(2);
    }
}
