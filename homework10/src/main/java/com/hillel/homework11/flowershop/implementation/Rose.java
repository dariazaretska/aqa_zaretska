package com.hillel.homework11.flowershop.implementation;

import com.hillel.homework11.flowershop.interfaces.Florist;
import com.hillel.homework11.flowershop.enums.DeliveryEnums;

public class Rose extends Flower implements Florist {
    private String sort;
    private Boolean withNeedles;
    int length;

    public Rose(int price, String name, String type, String colour, String sort, Boolean withNeedles, DeliveryEnums delivery) {
        super(price, name, type, colour, delivery);
        this.sort = sort;
        this.withNeedles = withNeedles;
    }

    public Rose(int price, String name, String type, String colour, String sort, DeliveryEnums delivery) {
        super(price, name, type, colour, delivery);
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
    public int sendFlowers() {
        int i;
        i = getPrice() + getDelivery().getValue();
        return i;
    }
}
