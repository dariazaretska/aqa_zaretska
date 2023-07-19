package com.hillel.homework11.flowershop.enums;

public enum DeliveryEnums {
    PICKUP(0),
    COURIER(150);

    private int value;

    DeliveryEnums(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Delivery" +
                "cost " + value;
    }
}
