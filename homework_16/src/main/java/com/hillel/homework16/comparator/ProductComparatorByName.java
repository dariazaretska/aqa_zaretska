package com.hillel.homework16.comparator;

import com.hillel.homework16.Product;

import java.util.Comparator;

public class ProductComparatorByName implements Comparator <Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
