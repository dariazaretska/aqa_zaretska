package com.hillel.homework10.flowershop;

public class Flower {
    int price;
    String name;
    String type;
    String colour;

// конструтор для горшочных цветов
    public Flower(int price, String name, String type) {
        this.price = price;
        this.name = name;
        this.type = type;
    }

//конструктор для срезанных цветов
    public Flower(int price, String name, String type, String colour) {
        this.price = price;
        this.name = name;
        this.type = type;
        this.colour = colour;
    }

    public Flower(){}
}