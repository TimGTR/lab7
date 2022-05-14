package com.company;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class Runner {

    public static void main(String[] args) {

        Semaphore operator = new Semaphore(3);

        Customer customer1 = new Customer("Иван");
        Customer customer2 = new Customer("Алексей");
        Customer customer3 = new Customer("Егор");
        Customer customer4 = new Customer("Петр");

        customer1.operator = operator;
        customer2.operator = operator;
        customer3.operator = operator;
        customer4.operator = operator;


        for (Customer customer : Arrays.asList(customer1, customer2, customer3,customer4)) {
            customer.start();
        }

        customer1.start();
    }
}
