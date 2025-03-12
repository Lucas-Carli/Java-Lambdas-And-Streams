package com.lambdas_and_streams.optional;

import com.lambdas_and_streams.util.Database;
import com.lambdas_and_streams.util.Videogame;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

//        Optional<Videogame> gtaOpt = Optional.of(Database.videogames.get(5));
        Optional<Videogame> gtaOpt = Optional.ofNullable(null);

//        System.out.println(gtaOpt.orElse(Database.videogames.get(6)));
        System.out.println(gtaOpt.orElseThrow(() -> new RuntimeException("Videogame not found")));
    }



}
