package com.OOPDesign.DAO;

import com.OOPDesign.Employee.Employee;

public class EmployeeDAO {

    ConnectionManager connectionManager;

    public EmployeeDAO(ConnectionManager cm){
        this.connectionManager = cm;
    }

    public void addEmployee(Employee employee){

        connectionManager.connect();
        System.out.println("Employee added " + employee.getName());
        connectionManager.disconnected();
    }

    public void deleteEmployee(Employee employee){

        connectionManager.connect();
        System.out.println("Employee deleted " + employee.getName());
        connectionManager.disconnected();
    }


}
