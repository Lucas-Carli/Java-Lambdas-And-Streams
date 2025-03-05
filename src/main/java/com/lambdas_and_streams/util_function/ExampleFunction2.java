package com.lambdas_and_streams.util_function;

import lombok.ToString;

import java.io.*;
import java.util.Arrays;
import java.util.function.Function;

public class ExampleFunction2 {

    static Function<Person, ByteArrayOutputStream> serializer = p -> {

        ByteArrayOutputStream inMemoryBytes = new ByteArrayOutputStream();

        try (ObjectOutputStream outputStream = new ObjectOutputStream(inMemoryBytes)) { // Flujo de datos de salida

            outputStream.writeObject(p);
            outputStream.flush();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return inMemoryBytes;
    };

    static Function<ByteArrayInputStream, Person> deserealizer = bais -> {
        try (ObjectInputStream objetcInputStream = new ObjectInputStream(bais)) {
            return (Person) objetcInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException();
        }
    };

    public static void main(String[] args) {
        ByteArrayOutputStream objectSerialized = serializer.apply(new Person("Max", 26));
        System.out.println(Arrays.toString(objectSerialized.toByteArray()));

        Person objectDeserialized = deserealizer.apply(new ByteArrayInputStream(objectSerialized.toByteArray()));

        System.out.println(objectDeserialized);

    }
}

@ToString
class Person implements Serializable {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}




