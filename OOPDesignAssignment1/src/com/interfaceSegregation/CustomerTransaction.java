package com.interfaceSegregation;

import java.util.List;

public class CustomerTransaction implements Accounting, Reporting{

    private Customer customer;
    private List<Product> productList;

    public CustomerTransaction(Customer customer, List<Product> productList) {
        this.customer = customer;
        this.productList = productList;
    }

    @Override
    public String prepareInvoice() {
        return "Prepare";
    }

    @Override
    public String chargeCustomer() {
        return customer.getName();
    }

    @Override
    public String getName() {
        return "Name";
    }

    @Override
    public String getDate() {
        return "Some date";
    }

    @Override
    public String getProductBreakdown() {
        String list = "";

        for(Product p : productList){
            list+= p.getProduct() +", ";
        }

        return list;
    }
}
