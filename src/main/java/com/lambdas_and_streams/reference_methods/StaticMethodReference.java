package com.lambdas_and_streams.reference_methods;

import java.util.UUID;
import java.util.function.Supplier;

public class StaticMethodReference {

    public static void main(String[] args) {

//      Supplier<UUID> getToken = () -> UUID.randomUUID(); // lambda
        Supplier<UUID> getToken = UUID::randomUUID;  // reference method
        System.out.println(getToken.get());

    }
}
