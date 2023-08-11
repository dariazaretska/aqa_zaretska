package com.hillel.homework18;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket {
    private List<Product> products;

    public ProductMarket(List<Product> products) {
        this.products = products;
    }

    public List<String> getAllProductNames() {
        return products.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
    }

    public List<String> getAllProductNamesSorted() {
        return products.stream()
                .map(Product::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Double> getPricesAbove10() {
        return products.stream()
                .map(Product::getPrice)
                .filter(price -> price > 10)
                .collect(Collectors.toList());
    }

    public List<Double> getPricesBelow5() {
        return products.stream()
                .map(Product::getPrice)
                .filter(price -> price < 5)
                .collect(Collectors.toList());
    }

    public List<String> getPricesAsString() {
        return products.stream()
                .map(product -> String.valueOf(product.getPrice()))
                .collect(Collectors.toList());
    }
}
