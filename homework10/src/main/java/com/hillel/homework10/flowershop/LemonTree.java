package com.hillel.homework10.flowershop;

public class LemonTree extends Flower {

    String[] flowerCare;
    Boolean eatable;

    public LemonTree(int price, String name, String type, String[] flowerCare, Boolean eatable) {
        super(price, name, type);
        this.flowerCare = flowerCare;
        this.eatable = eatable;
    }

    public LemonTree(){}
}
