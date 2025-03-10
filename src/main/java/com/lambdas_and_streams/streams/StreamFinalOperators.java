package com.lambdas_and_streams.streams;

import com.lambdas_and_streams.util.Database;
import com.lambdas_and_streams.util.Videogame;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFinalOperators {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();
//        countOperator(videogames);
//        forEachOperator(videogames);
//        anyMatchOperator(videogames);
//        allMatchOperator(videogames);
//        noneMatchOperator(videogames);
//        findFirstOperator(videogames);
//        findAnyOperator(videogames);
//        reducerOperator(videogames);
//        maxOperator(videogames);
        minOperator(videogames);
    }

    // Para contar
    static void countOperator(Stream<Videogame> stream) {
        System.out.println(stream.count());
    }

    // Para iterar
    static void forEachOperator(Stream<Videogame> stream) {
        stream.forEach(System.out::println);
    }

    // Para matchear alguno
    static void anyMatchOperator(Stream<Videogame> stream) {
//        boolean r = stream.anyMatch(v -> v.getTotalSold() > 1000000);
        boolean r = stream.anyMatch(v -> v.getTotalSold() > 1);
        System.out.println(r);
    }

    // Para matchear todas las condiciones
    static void allMatchOperator(Stream<Videogame> stream) {
        boolean r = stream.allMatch(v -> v.getTotalSold() > 1);
        System.out.println(r);
    }

    // Para matchear todas las condiciones
    static void noneMatchOperator(Stream<Videogame> stream) {
        boolean r = stream.noneMatch(v -> v.getReviews().isEmpty());
        System.out.println(r);
    }

    // Para encontrar el primero en la lista
    static void findFirstOperator(Stream<Videogame> stream) {
        Optional<Videogame> r = stream.findFirst();
        System.out.println(r);
    }

    // Para encontrar alguno
    static void findAnyOperator(Stream<Videogame> stream) {
        Optional<Videogame> r = stream.findAny();
        System.out.println(r);
    }

    // Total de ventas
    static void reducerOperator(Stream<Videogame> stream) {
        Optional<Integer> r = stream
//                .filter(v -> !v.getIsDiscount())
                .filter(Videogame::getIsDiscount)
                .map(Videogame::getTotalSold)
                .reduce(Integer::sum);

        System.out.println(r);
    }

    // Maximo valor
    static void maxOperator(Stream<Videogame> stream) {
        Optional<Videogame> r = stream.max(Comparator.comparing(Videogame::getName));
        System.out.println(r.get().getName());
    }

    // minimo valor
    static void minOperator(Stream<Videogame> stream) {
        Optional<Videogame> r = stream.min(Comparator.comparing(Videogame::getName));
        System.out.println(r.get().getName());
    }

}
