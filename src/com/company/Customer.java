package com.company;

public class Customer extends Thread {
    private final String customerName;
    Operator operator;

    public Customer(String name) {
        this.customerName = name;
        this.operator = operator;
        start();

    }

    public String getCustomerName() {
        return customerName;
    }

    public void startCall(Operator operator) {
        if (operator.isOperatorBusy()) {
            System.out.println(this.customerName + " звонит в Колл Центр");
        }
    }


    public void endCall() {
        System.out.println(this.customerName + " завершил звонок");
    }

    @Override
    public void run() {
        if (operator != null && operator.isOperatorBusy()) {
            try {
                startCall(operator);
                wait(5000);
                endCall();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
