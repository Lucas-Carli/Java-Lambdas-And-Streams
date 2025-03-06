package com.lambdas_and_streams.real_applications;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambdas {

    public static void main(String[] args) {

        // Ordenamiento por números
        List<Integer> numbers = Arrays.asList(4,3,6,8,7,5,8,10);
        numbers.sort((a, b) -> a - b);
        System.out.println(numbers);

        // Ordenamiento por strings
        List<String> names = Arrays.asList("Max","Alex","Opal");
        names.sort(String::compareTo); // :: referencia a métodos
        System.out.println(names);

        // Ordenamiento reverso por strings
        names.sort(Comparator.reverseOrder());
        System.out.println(names);

        List<Person> persons = Arrays.asList(
                new Person("Robert", 31),
                new Person("ben", 32),
                new Person("Andy", 32),
                new Person("Peter", 27)
        );

        persons.sort(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName));

        System.out.println(persons);
    }

}

@Data
@AllArgsConstructor
class Person {
    private String name;
    private Integer age;
}
