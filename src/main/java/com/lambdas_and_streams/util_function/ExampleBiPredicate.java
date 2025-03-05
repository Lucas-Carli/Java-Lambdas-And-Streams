package com.lambdas_and_streams.util_function;

import java.util.function.BiPredicate;

public class ExampleBiPredicate {

    static BiPredicate<String, String> myEquals = (s1, s2) -> s1.concat(s2).equals("HelloWorld");

    public static void main(String[] args) {

        String s1 = "Hell";
        String s2 = "oWorld";
        System.out.println(myEquals.test(s1,s2));

    }
}
