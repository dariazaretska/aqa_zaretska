package com.hillel.homework16;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Apple", 1.5));
        productList.add(new Product("Banana", 0.8));
        productList.add(new Product("Orange", 2.0));
        productList.add(new Product("Blueberry", 3.5));
        productList.add(new Product("Mango", 6.0));
        productList.add(new Product("Watermelon", 11.0));

        ProductMarket market = new ProductMarket(productList);

        System.out.println("All product names: " + market.getAllProductNames());
        System.out.println("Product names alphabetically: " + market.getProductNamesAlphabetically());
        System.out.println("Products with price greater than 10: " + market.getProductsGreaterThan10());
        System.out.println("Products with price less than 5: " + market.getProductsLessThan5());
        System.out.println("All prices as strings: " + market.getAllPricesAsString());

        //comparator
        List<Product> sortedProducts = market.sortProductsByPrice();
        System.out.println("Products sorted by price: " + sortedProducts);

        List<Product> sortedByNameProducts = market.sortProductsByName();
        System.out.println("Products sorted by name: " + sortedByNameProducts);
    }
}