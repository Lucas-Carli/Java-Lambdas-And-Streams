package com.lambdas_and_streams.real_applications;

import com.lambdas_and_streams.util.Console;
import com.lambdas_and_streams.util.InvalidVideogameException;
import com.lambdas_and_streams.util.Videogame;

import java.util.List;
import java.util.Objects;

public class Rules {

    private Rules() {

    }

    private final static Validator<Videogame, RuntimeException> isNull = videogame -> {
        if (Objects.isNull(videogame)) throw new IllegalArgumentException("Can´t be null");
    };

    private final static Validator<Videogame, RuntimeException> validPrice = videogame -> {
        if (videogame.getPrice() < 20) throw new InvalidVideogameException("Price must be grather than 20");
    };

    private final static Validator<Videogame, RuntimeException> validConsole = videogame -> {
        if (!videogame.getConsole().equals(Console.XBOX))
            throw new InvalidVideogameException("Console must be for XBOX");
    };

    private final static Validator<Videogame, RuntimeException> validReviews = videogame -> {
        if (videogame.getReviews().isEmpty())
            throw new InvalidVideogameException("Reviews cannot be empty");
    };

    private final static Validator<Videogame, RuntimeException> validTotalSold = videogame -> {
        if (videogame.getTotalSold() < 10)
            throw new InvalidVideogameException("Total sold must be greater than 10");
    };

    private final static Validator<Videogame, RuntimeException> validDiscount = videogame -> {
        if (videogame.getIsDiscount())
            throw new InvalidVideogameException("Videogame dont have discount");
    };

    public static List<Validator<Videogame, RuntimeException>> rules = List.of(
            isNull, validPrice, validConsole, validReviews, validTotalSold, validDiscount
    );


}

