package com.OOPDesign.DAO;

public class ConnectionManager {

    public void connect(){
        System.out.println("Connected...");
    }

    public void getConnectionObject(){
        System.out.println("The connection object is this one");
    }

    public void disconnected(){
        System.out.println("Disconnected");
    }
}
