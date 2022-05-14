package com.company;

public class Operator extends Thread {

    private final int operatorNumber;
    Customer customer;
    private boolean isBusy;

    public Operator(int operatorNumber) {
        this.operatorNumber = operatorNumber;
        this.customer = customer;
        start();
    }

    public boolean isOperatorBusy() {
        return isBusy;
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

