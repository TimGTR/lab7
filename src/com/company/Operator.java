package com.company;

import java.util.ArrayList;
import java.util.List;

public class Operator extends Thread{

    private final int operatorNumber;

    private boolean isBusy;

    List<Thread> operators = new ArrayList<>();

    public boolean isOperatorBusy()  {
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
        while (!isBusy) {
            System.out.println("Оператор №" + operatorNumber + " обслуживает клиента ");
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            isBusy = true;
        }


    }





}
