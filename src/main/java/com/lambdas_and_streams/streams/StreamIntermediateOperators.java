package com.lambdas_and_streams.streams;

import com.lambdas_and_streams.util.BasicVideogame;
import com.lambdas_and_streams.util.Database;
import com.lambdas_and_streams.util.Review;
import com.lambdas_and_streams.util.Videogame;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediateOperators {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

//        distinctOperator(videogames);
//        limitoperator(videogames);
//        skipOperator(videogames);
//        filterOperator(videogames);
//        mapOperator(videogames);
//        flatMapOperator(videogames);
//        mapVSFlatMapOperator(videogames);
//        peekOperator(videogames);
//        sortOperator(videogames);
//        takeWhileOperator(videogames);
        dropWhileOperator(videogames);
    }

    // Contabilizo sin contar los repetidos
    static void distinctOperator(Stream<Videogame> stream) {
        System.out.println(stream.distinct().count());
    }

    // Traer los primeros 5 elementos
    static void limitoperator(Stream<Videogame> stream) {
        List<Videogame> r = stream.limit(5).collect(Collectors.toList());
        r.forEach(System.out::println);
    }

    // Que evite los primeros 15 - por ende me trae los ultimos 5 en este caso
    static void skipOperator(Stream<Videogame> stream) {
        List<Videogame> r = stream.skip(15).collect(Collectors.toList());
        r.forEach(System.out::println);
    }

    // Que evite los primeros 15 - por ende me trae los ultimos 5 en este caso
    static void filterOperator(Stream<Videogame> stream) {
        List<Videogame> r = stream
                .filter(v -> v.getPrice() > 12.0)
                .filter(v -> !v.getIsDiscount())
                .filter(v -> v.getOfficialWebsite().contains("forza"))
                .collect(Collectors.toList());
        r.forEach(System.out::println);
    }

    // Para utilizar y procesar datos
    static void mapOperator(Stream<Videogame> stream) {
        List<BasicVideogame> basicVideoGames = stream
                .map(v -> {
                    return BasicVideogame.builder()
                            .name(v.getName())
                            .price(v.getPrice())
                            .console(v.getConsole())
                            .build();
                }).collect(Collectors.toList());

        List<String> titles = basicVideoGames.stream()
                .map(BasicVideogame::getName).collect(Collectors.toList());

        basicVideoGames.forEach(System.out::println);
        System.out.println("---------");
        titles.forEach(System.out::println);
    }

    static void flatMapOperator(Stream<Videogame> stream) {
        List<Review> r = stream.flatMap(v -> v.getReviews().stream()).collect(Collectors.toList());
        System.out.println(r);
    }

    static void mapVSFlatMapOperator(Stream<Videogame> stream) {
//        var totalReviews = stream.map(v -> v.getReviews().size()).collect(Collectors.toList());
        Long totalReviews = stream.flatMap(v -> v.getReviews().stream()).count();

        System.out.println(totalReviews);
    }

    static void peekOperator(Stream<Videogame> stream) {
//        stream.peek(v -> v.setName("")).forEach(System.out::println);
        stream.peek(System.out::println).forEach(System.out::println);
    }

    static void sortOperator(Stream<Videogame> stream) {
        List<Videogame> listSorted = stream
                .sorted(Comparator.comparingInt(v -> v.getReviews().size()))
                .collect(Collectors.toList());
        listSorted.forEach(System.out::println);
    }

    static void takeWhileOperator(Stream<Videogame> stream) {
        List<Videogame> r = stream
                .sorted(Comparator.comparing(Videogame::getName))
                .takeWhile(v -> !v.getName().startsWith("M"))
                .collect(Collectors.toList());
        r.forEach(System.out::println);
    }

    static void dropWhileOperator(Stream<Videogame> stream) {
        List<Videogame> r = stream
                .sorted(Comparator.comparing(Videogame::getName))
                .dropWhile(v -> !v.getName().startsWith("M"))
                .collect(Collectors.toList());
        r.forEach(System.out::println);
    }


}
