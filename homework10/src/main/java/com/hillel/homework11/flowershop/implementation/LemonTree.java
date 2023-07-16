package com.hillel.homework11.flowershop;

import java.util.Arrays;

public class LemonTree extends Flower {

    private String[] flowerCare;
    private Boolean eatable;
    protected int flowerpot = 190;

    public LemonTree(int price, String name, String type, String[] flowerCare, Boolean eatable,
                     String colour, int quantity) {
        super(price, name, type, colour, quantity);
        this.flowerCare = flowerCare;
        this.eatable = eatable;
    }

    public LemonTree(){}

    public String[] getFlowerCare() {
        return flowerCare;
    }

    public Boolean getEatable() {
        return eatable;
    }

    public void setFlowerCare(String[] flowerCare) {
        if (flowerCare != null) {
            this.flowerCare = flowerCare;
        }
    }

    public void setEatable(Boolean eatable) {
        this.eatable = eatable;
    }
//  метод считает стоимость лимонного дерева с декоративным горшком
    @Override
    public int calculatePrice() {
        int a = getPrice();
        int b = flowerpot;
        int c = getQuantity();
        int price = (a + b)*c;
        setPrice(price);
        return price;
    }

    @Override
    public String toString() {
        return "Лимонное дерево. " +
                "Правила ухода: " + Arrays.toString(flowerCare) +
                ", съедобный: " + eatable +
                ", дополнительный декоративный горшок " + flowerpot;
    }
}
