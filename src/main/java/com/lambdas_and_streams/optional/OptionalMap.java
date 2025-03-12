package com.lambdas_and_streams.optional;

import com.lambdas_and_streams.util.Database;
import com.lambdas_and_streams.util.Videogame;

import java.util.Optional;

public class OptionalMap {

    public static void main(String[] args) {
        Optional<Videogame> gtaOpt = Optional.of(Database.videogames.get(5));

        String website = gtaOpt.map(videogame -> "The official website is " + videogame.getOfficialWebsite())
                .orElseThrow(RuntimeException::new);

        System.out.println(website);

    }

}
