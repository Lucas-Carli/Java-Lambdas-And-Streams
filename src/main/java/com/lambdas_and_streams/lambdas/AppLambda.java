package com.lambdas_and_streams.lambdas;

import java.util.List;

public class AppLambda {

    public static void main(String[] args) {

        List<String> countries = List.of("Mexico", "Colombia", "Argentina", "Chile", "Uruguay");

        for (String c : countries) {
            System.out.println(c);
        }

        countries.forEach(c -> System.out.println(c.toUpperCase()));

    }
}
