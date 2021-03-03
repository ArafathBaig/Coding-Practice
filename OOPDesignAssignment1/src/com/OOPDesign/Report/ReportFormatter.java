package com.OOPDesign.Report;

public class ReportFormatter {

    public String convertObjectToXML(){
        return "xml";
    }

    public String convertObjectToCSV(){
        return "csv";
    }

    public void getFormattedValue(){
        System.out.println("Fomatted value is either xml or csv");
    }
}
