package com.SingletonPattern;

public class PerformanceStage {

    private static PerformanceStage INSTANCE = null;
    private PerformanceStage(){

    }

    public static PerformanceStage getInstance(){
        if(INSTANCE == null)
            INSTANCE = new PerformanceStage();

        return INSTANCE;
    }
}
