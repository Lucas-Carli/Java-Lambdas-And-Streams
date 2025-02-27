package com.lambdas_and_streams.fundamentals;

import java.util.List;

public interface DatabaseService<T> {

    T getById(Long id);
    List<T> getAllRecords();

}
