package com.CofeeShop.Subject;

import com.CofeeShop.Observer.Customer;
import com.CofeeShop.Observer.WaitingCustomer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

    List<WaitingCustomer> customers;

    public CustomerDAO() {
        this.customers = new ArrayList<>();
    }

    public List<WaitingCustomer> generateCustomers(){
        customers.add(new Customer("Arafath", "Coffee"));
        customers.add(new Customer("Najjashi", "Water"));
        customers.add(new Customer("Baig", "Tea"));
        customers.add(new Customer("Mogul", "Juice"));
        customers.add(new Customer("Johnn", "Shake"));

        return customers;
    }


}
