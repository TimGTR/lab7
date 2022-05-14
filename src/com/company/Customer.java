package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.Semaphore;

public class Customer extends Thread {
    Semaphore operator;

    public Customer(String name) {
        this.name = name;
    }

    public String name;



    @Override
    public void run() {
        System.out.println(this.name + " ждет свободного оператора");
        try {
            operator.acquire();
            System.out.println(this.name + " разговаривает с оператором");
            System.out.println(this.name + " закончил разговор");
            operator.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
