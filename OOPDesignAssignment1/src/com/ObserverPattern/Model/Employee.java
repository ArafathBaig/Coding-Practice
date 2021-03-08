package com.ObserverPattern.Model;

public class Employee {
    private String name;
    private static int id= 0;

    public Employee(String name) {
            this.name = name;
        this.id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getId() {
        return id;
    }


}
