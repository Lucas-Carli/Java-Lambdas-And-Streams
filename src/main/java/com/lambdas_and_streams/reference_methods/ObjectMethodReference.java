package com.lambdas_and_streams.reference_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ObjectMethodReference {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(10);
        IntStream repeat = IntStream.range(1, 11);
        // Expresión lambda simple
//        repeat.forEach(i -> numbers.add(i));
        // Expresión lambda por método referenciado
        repeat.forEach(numbers::add);
        System.out.println(numbers);

    }

}
