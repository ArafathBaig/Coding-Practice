package com.DependencyInversion.processes;

public class LaptopManufacturing extends GeneralManfuacturingProcess{

    public LaptopManufacturing(String name) {
        super(name);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assembled laptop");
    }

    @Override
    protected void testDevice() {
        System.out.println("tested laptop");
    }

    @Override
    protected void packageDevice() {
        System.out.println("pakaged laptop");
    }

    @Override
    protected void storeDevice() {
        System.out.println("stored laptop");
    }
}
