package com.lambdas_and_streams.fundamentals;

import java.util.List;

public class App {

    public static void main(String[] args) {

//         Interfaces and Generic Progamming
//        DatabaseService db = new ProductDB();
//        System.out.println("Text is "  + db.getById(20L));

        // Anonymous classes
        System.out.println(Product.class.getName());
        System.out.println(Employee.class.getName());
        System.out.println(String.class.getName());

        DatabaseService<String> dbAnonymous = new DatabaseService<String>() {

            @Override
            public String getById(Long id) {
                return "";
            }

            @Override
            public List<String> getAllRecords() {
                return List.of();
            }
        };

        System.out.println(dbAnonymous.getClass().getName());


    }

}
