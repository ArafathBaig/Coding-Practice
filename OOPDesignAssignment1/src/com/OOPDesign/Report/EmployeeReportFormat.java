package com.OOPDesign.Report;

import com.OOPDesign.Employee.Employee;

public class EmployeeReportFormat extends ReportFormatter {

    private Employee employee;
    private String format;

    public EmployeeReportFormat(Employee emp, String format){
        this.employee = employee;
        this.format = format;
    }


}
