package com.CofeeShop.Subject;

import com.CofeeShop.Observer.Customer;
import com.CofeeShop.Observer.WaitingCustomer;

import java.util.*;

public class CoffeeAttendee {

    private List<WaitingCustomer> customers;
    private String completedOrder ;
    private CustomerDAO service;
    private Queue<WaitingCustomer> orders;
    private WaitingCustomer currentCustomerOrder;

    public CoffeeAttendee(){
        this.orders = new LinkedList<>();
        service = new CustomerDAO();
        completedOrder ="";
    }

    public void takeOrder(){

        customers = service.generateCustomers();

        for(WaitingCustomer customer :customers) {
            customer.takeOrder();
            orders.add(customer);
        }
    }

    public void prepareOrder(){

        while(!orders.isEmpty()){
            this.currentCustomerOrder = orders.poll();
            System.out.println("Preparing order..");
            callOutCompletedOrder();
        }
    }

    private void callOutCompletedOrder(){
        currentCustomerOrder.orderReady();
    }
}
