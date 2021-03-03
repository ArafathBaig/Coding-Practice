package com.OOPDesign.Employee;

public class Employee {

    private long id;
    private String name;
    private String department;
    private Boolean working;

    public Employee(long id, String name, String department, Boolean working) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Boolean getWorking() {
        return working;
    }

    public void setWorking(Boolean working) {
        this.working = working;
    }
}
