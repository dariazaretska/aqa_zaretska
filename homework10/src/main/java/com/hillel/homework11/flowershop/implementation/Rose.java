package com.hillel.homework11.flowershop;

public class Rose extends Flower {
    private String sort;
    private Boolean withNeedles;
    int length;


    public Rose(int price, String name, String type, String colour, String sort, Boolean withNeedles,
                int quantity) {
        super(price, name, type, colour, quantity);
        this.sort = sort;
        this.withNeedles = withNeedles;
    }
// конструктор для букетов
    public Rose(int price, String name, String type, String colour, String sort, int quantity) {
        super(price, name, type, colour, quantity);
        this.sort = sort;
    }

    public Rose(){}

    public String getSort() {
        return sort;
    }

    public Boolean getWithNeedles() {
        return withNeedles;
    }

    public int getLength() {
        return length;
    }

    public void setSort(String sort) {
        if (sort != null) {
            this.sort = sort;
        }
    }

    public void setWithNeedles(Boolean withNeedles) {
        this.withNeedles = withNeedles;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        }
    }

    @Override
    public int calculatePrice() {
        int a = getPrice();
        int b = getQuantity();
        int price = a * b;
        setPrice(price);
        return price;
    }

    @Override
    public String toString() {
        return "Роза. " +
                " сорт: " + sort +
                ", стоимость: " + getPrice() +
                ", колючая " + true;
    }
}