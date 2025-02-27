package com.lambdas_and_streams.fundamentals;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Product {

    private Long id;
    private String name;
    private Double price;


    public  Product(){}

}
