package com.company;

public class Customer extends Thread {

    public Customer(String name) {
        this.customerName = name;
        start();
    }
    private final String customerName;

    public String getCustomerName() {
        return customerName;
    }


    public void startCall() {
        System.out.println(this.customerName + " звонит в Колл Центр");
    }

    public void endCall() {
        System.out.println(this.customerName + " завершил звонок");
    }

    @Override
    public void run() {

        startCall();


    }
}
