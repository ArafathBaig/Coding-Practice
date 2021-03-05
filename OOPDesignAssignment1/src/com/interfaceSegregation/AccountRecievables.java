package com.interfaceSegregation;

public class AccountRecievables {

    private Accounting customerAccounts;

    public AccountRecievables(Accounting customerAccounts) {
        this.customerAccounts = customerAccounts;
    }

    public String prepareInvoice(){
        return customerAccounts.prepareInvoice();
    }

    public String chargeCustomer(){
        return customerAccounts.chargeCustomer();
    }
}
