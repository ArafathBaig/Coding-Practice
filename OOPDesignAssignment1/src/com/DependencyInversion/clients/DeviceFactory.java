package com.DependencyInversion.clients;

import com.DependencyInversion.processes.GeneralManfuacturingProcess;
import com.DependencyInversion.processes.LaptopManufacturing;
import com.DependencyInversion.processes.SmartPhoneManufacturing;

public class DeviceFactory {
    public static void main(String[] args) {
        GeneralManfuacturingProcess manufacturer = new SmartPhoneManufacturing("IPhone");
        manufacturer.launchProcess();

        GeneralManfuacturingProcess laptopManufacturer = new LaptopManufacturing("Dell");
        laptopManufacturer.launchProcess();
    }
}
