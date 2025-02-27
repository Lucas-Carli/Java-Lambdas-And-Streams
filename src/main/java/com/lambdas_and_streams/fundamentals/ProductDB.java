package com.lambdas_and_streams.fundamentals;

import java.util.List;

public class ProductDB implements DatabaseService<Product> {


    @Override
    public Product getById(Long id) {
        Product p = new Product();
        p.setId(id);
        p.setName("Cookies");
        p.setPrice(20.0);
        return p;
    }

    @Override
    public List<Product> getAllRecords() {
        return null;
    }
}
