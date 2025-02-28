package com.lambdas_and_streams.lambdas;

import com.lambdas_and_streams.fundamentals.Employee;
import com.lambdas_and_streams.fundamentals.Product;

public class AppGenericLambda {

    public static void main(String[] args) {

        Printer<String> printString = string -> System.out.println(string);
        Printer<Product> printProduct = product -> System.out.println(product);
        Printer<Employee> printEmployee = employee -> System.out.println(employee);

        printString.print("Hello world");

        Product myProduct = new Product();
        myProduct.setId(21321L);
        myProduct.setPrice(1000000.5);
        myProduct.setName("smartphone");

        Employee myEmployee = new Employee();
        myEmployee.setName("George");
        myEmployee.setDni("123645");
        myEmployee.setSalary(1000.0);

        printProduct.print(myProduct);
        printEmployee.print(myEmployee);
    }
}
