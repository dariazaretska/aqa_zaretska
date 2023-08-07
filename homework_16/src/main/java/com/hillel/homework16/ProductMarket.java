package com.hillel.homework16;

import com.hillel.homework16.comparator.ProductComparatorByName;
import com.hillel.homework16.comparator.ProductComparatorByPrice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ProductMarket {
    private List<Product> products;
    public ProductMarket(List<Product> products) {
        this.products = new ArrayList<>(products);
    }

    public List<String> getAllProductNames() {
        List<String> names = new ArrayList<>();
        for (Product product : products) {
            names.add(String.valueOf(product.getClass()));
        }
        return names;
    }

    public List<String> getProductNamesAlphabetically() {
        List<String> names = getAllProductNames();
        Collections.sort(names);
        return names;
    }

    public List<Product> getProductsGreaterThan10() {
        List<Product> selectedProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() > 10) {
                selectedProducts.add(product);
            }
        }
        return selectedProducts;
    }

    public List<Product> getProductsLessThan5() {
        List<Product> selectedProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() < 5) {
                selectedProducts.add(product);
            }
        }
        return selectedProducts;
    }

    public List<String> getAllPricesAsString() {
        List<String> prices = new ArrayList<>();
        for (Product product : products) {
            prices.add(String.valueOf(product.getPrice()));
        }
        return prices;
    }

    public List<Product> sortProductsByName(){
        List<Product> sortedProductsName = new ArrayList<>(products);
        Collections.sort(sortedProductsName, new ProductComparatorByName());
        return sortedProductsName;
    }

    public List<Product> sortProductsByPrice(){
        List<Product> sortedProductsPrice = new ArrayList<>(products);
        Collections.sort(sortedProductsPrice, new ProductComparatorByPrice());
        return sortedProductsPrice;
    }

}
