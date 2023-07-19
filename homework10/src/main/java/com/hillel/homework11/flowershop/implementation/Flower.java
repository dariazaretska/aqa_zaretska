package com.hillel.homework11.flowershop.implementation;

import com.hillel.homework11.flowershop.enums.DeliveryEnums;

public class Flower {
    private int price;
    private String name;
    private String type;
    private String colour;
    private DeliveryEnums delivery;

// конструтор для горшочных цветов
    public Flower(int price, String name, String type, DeliveryEnums delivery) {
        this.price = price;
        this.name = name;
        this.type = type;
        this.delivery = delivery;
    }

//конструктор для срезанных цветов
    public Flower(int price, String name, String type, String colour, DeliveryEnums delivery) {
        this.price = price;
        this.name = name;
        this.type = type;
        this.colour = colour;
        this.delivery = delivery;
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

    public DeliveryEnums getDelivery()  {
        if (delivery != null) {
            this.delivery = delivery;
        }
        return delivery;
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

    public void setDelivery(DeliveryEnums delivery) {
        this.delivery = delivery;
    }
}