package com.hillel.homework11.flowershop;

public abstract class Flower {
    private int price;
    private String name;
    private String type;
    private String colour;
    private int quantity;

    public Flower(int price, String name, String type, String colour, int quantity) {
        this.price = price;
        this.name = name;
        this.type = type;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
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

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    public abstract int calculatePrice();

}