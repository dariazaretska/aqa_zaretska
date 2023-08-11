package com.hillel.homework18;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Apple", 2.5));
        productList.add(new Product("Banana", 1.0));
        productList.add(new Product("Orange", 3.0));
        productList.add(new Product("Grapes", 12.0));
        productList.add(new Product("Pineapple", 7.5));

        ProductMarket market = new ProductMarket(productList);

        System.out.println("All product names: " + market.getAllProductNames());
        System.out.println("All product names sorted: " + market.getAllProductNamesSorted());
        System.out.println("Prices above 10: " + market.getPricesAbove10());
        System.out.println("Prices below 5: " + market.getPricesBelow5());
        System.out.println("Prices as strings: " + market.getPricesAsString());
    }
}