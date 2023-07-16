package com.hillel.homework11.flowershop;

public class Flower {
    private int price;
    private String name;
    private String type;
    private String colour;

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

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public void setType(String type) {
        if (type != null) {
            this.type = type;
        }
    }

    public void setColour(String colour) {
        if (colour != null) {
            this.colour = colour;
        }
    }
}