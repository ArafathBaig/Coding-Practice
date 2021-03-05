package com.interfaceSegregation;

public class TransactionReportGenerator {

    private Reporting CustomerTransation;

    public TransactionReportGenerator(Reporting customerTransation) {
        CustomerTransation = customerTransation;
    }

    public Reporting getCustomerTransation() {
        return CustomerTransation;
    }

    public void setCustomerTransation(Reporting customerTransation) {
        CustomerTransation = customerTransation;
    }
}

