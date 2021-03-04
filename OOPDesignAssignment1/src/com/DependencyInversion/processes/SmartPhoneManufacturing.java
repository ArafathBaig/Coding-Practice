package com.DependencyInversion.processes;

public class SmartPhoneManufacturing extends GeneralManfuacturingProcess {

    public SmartPhoneManufacturing(String name) {
        super(name);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assembled smartphone");
    }

    @Override
    protected void testDevice() {
        System.out.println("tested smartphone");
    }

    @Override
    protected void packageDevice() {
        System.out.println("pakaged Smartphone");
    }

    @Override
    protected void storeDevice() {
        System.out.println("stored smartphone");
    }
}
