package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.Semaphore;

public class Customer extends Thread {
    Semaphore operator; //объект класса семафор
    public String name;

    public Customer(String name) {
        this.name = name;
    }

    public void endCall() throws InterruptedException {
        System.out.println(name + " сбросил звонок");
        sleep(5000);
        System.out.println(name + " перезвонил в КоллЦентр");

    }


    @Override
    public void run() {
        System.out.println(this.name + " ждет свободного оператора");
        try {
            if (operator.tryAcquire()) { //проверяем наличие свободного оператора
                operator.acquire(); //занимаем ресурс
                System.out.println(this.name + " разговаривает с оператором");
                sleep(9000);
                System.out.println(this.name + " закончил разговор");
                operator.release();//освобождаем ресурс
            } else {
                endCall();
            }
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
