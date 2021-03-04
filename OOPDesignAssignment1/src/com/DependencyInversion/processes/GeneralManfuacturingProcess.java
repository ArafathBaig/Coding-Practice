package com.DependencyInversion.processes;

public abstract class GeneralManfuacturingProcess {

    private String processName;
    public GeneralManfuacturingProcess(String name){
        this.processName = name;
    }

    protected abstract void assembleDevice();
    protected abstract void testDevice();
    protected abstract void packageDevice();
    protected abstract void storeDevice();

    public void launchProcess(){

        if(processName != null && !processName.isEmpty()){
            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        }else{
            System.out.println("process name was specified");
        }
    }
}
