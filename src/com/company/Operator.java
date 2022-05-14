package com.company;

import java.util.ArrayList;
import java.util.List;

public class Operator extends Thread{

    private int operatorNumber;

    private boolean operatorState;

    List<Thread> operators = new ArrayList<>();

    public boolean isOperatorBusy()  {
        return operatorState;
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
        while (operatorState) {
            System.out.println("Оператор №" + operatorNumber + " обслуживает клиента ");
            operatorState = true;

            try {
                sleep(50000);
                notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            operatorState = false;
        }


    }





}
