package com.hillel.homework10.flowershop;

public class Rose extends Flower {
    String sort;
    Boolean withNeedles;
    int length;

    public Rose(int price, String name, String type, String colour, String sort, Boolean withNeedles) {
        super(price, name, type, colour);
        this.sort = sort;
        this.withNeedles = withNeedles;
    }

    public Rose(int price, String name, String type, String colour, String sort) {
        super(price, name, type, colour);
        this.sort = sort;
    }


    public Rose(){}
}
