package com.lambdas_and_streams.util_function;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExampleConsumer {

    public static void main(String[] args) {

        /* Consumer */
        Set<Integer> nums = Set.of(1, 2, 3, 4, 5);
        List<Integer> squares = new LinkedList<>();

        nums.forEach(n -> squares.add(n * n));

        System.out.println(squares);

        /* BiConsumer */
        Map<Boolean, String> map = Map.of(true, "This is the truth", false, "This is the lie");
        map.forEach((k, v) ->System.out.println(k + " - " + v));
    }

}
