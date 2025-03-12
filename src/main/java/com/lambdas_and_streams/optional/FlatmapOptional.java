package com.lambdas_and_streams.optional;

import com.lambdas_and_streams.util.Movie;

import java.util.Optional;

public class FlatmapOptional {

    public static void main(String[] args) {
    Movie movie = new Movie("The run", 20.42);
    Optional<Movie> movieOpt = Optional.of(movie);

    String movieName = movieOpt.flatMap(Movie::getName).get();

        System.out.println(movieName);

    }


}
