package com.lambdas_and_streams.fundamentals;

import com.lambdas_and_streams.lambdas.Math;

public class LambdaApp {

    public static void main(String[] args) {

        com.lambdas_and_streams.lambdas.Math substract = (a, b) -> a - b;

        com.lambdas_and_streams.lambdas.Math multiply = (a, b) -> a * b;

        Math divide = (a, b) -> {
            System.out.println("Start");
            return a / b;
        };


//        System.out.println(substract.execute(15.0, 5.0));
//        System.out.println(multiply.execute(10.0, 10.0));
//        System.out.println(divide.execute(500.0, 2.0));
        System.out.println(divide.sum(30.0, 40.0));

    }
}
