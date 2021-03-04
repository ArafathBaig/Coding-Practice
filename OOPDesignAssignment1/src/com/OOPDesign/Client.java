package com.OOPDesign;

import com.OOPDesign.DAO.ConnectionManager;
import com.OOPDesign.DAO.EmployeeDAO;
import com.OOPDesign.Employee.Employee;
import com.OOPDesign.OpenClosedPatter.Doctor;
import com.OOPDesign.Report.EmployeeReportFormat;

public class Client {

    private static EmployeeDAO employeeDAO ;
    public static void main(String[] args) {
        ConnectionManager cm = new ConnectionManager();
        employeeDAO = new EmployeeDAO(cm);
//        Employee doctor = new Doctor(5,"Arafath","Engineer",true);
//
//        hireNewEmployee(employee);
//        terminateEmployee(employee);
//        printReport(employee);
    }

    private static void hireNewEmployee(Employee employee){
        employeeDAO.addEmployee(employee);
    }

    private static void terminateEmployee(Employee employee){
        employeeDAO.deleteEmployee(employee);
    }

    private static void printReport(Employee employee){
        EmployeeReportFormat emp = new EmployeeReportFormat(employee, "xml");
        emp.convertObjectToCSV();
    }
}
