package com.company;

import java.util.ArrayList;
import java.util.List;

public class Operator extends Thread {

    Customer customer;
    private final int operatorNumber;
    private boolean isBusy;

    public boolean isOperatorBusy() {
        return isBusy;
    }

    public Operator(int operatorNumber) {
        this.operatorNumber = operatorNumber;
        start();
    }


    public int getOperatorNumber() {
        return operatorNumber;
    }

    @Override
    public void run() {
        if (customer != null) {
            while (!isBusy) {
                System.out.println("Оператор №" + operatorNumber + " обслуживает клиента " + customer.getCustomerName());
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                isBusy = true;
                notifyAll();
            }


        }
    }

}
