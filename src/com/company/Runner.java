package com.company;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<Operator> operators = new ArrayList<>();
        for(int i = 1; i < 4; i++) {
            operators.add(new Operator(i));
        }



        Customer customer1 = new Customer("Иван");
        Customer customer2 = new Customer("Алексей");
        Customer customer3 = new Customer("Егор");
        Customer customer4 = new Customer("Петр");






    }
}
