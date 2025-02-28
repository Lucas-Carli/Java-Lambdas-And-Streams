package com.lambdas_and_streams.lambdas;

@FunctionalInterface
public interface Printer<T> {

    void print(T toPrint);
}
