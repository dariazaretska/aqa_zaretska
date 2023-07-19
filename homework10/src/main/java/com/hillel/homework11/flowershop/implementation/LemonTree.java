package com.hillel.homework11.flowershop.implementation;

import com.hillel.homework11.flowershop.interfaces.Florist;
import com.hillel.homework11.flowershop.enums.DeliveryEnums;

public class LemonTree extends Flower implements Florist {

    private String[] flowerCare;
    private Boolean eatable;
    protected int flowerpot = 190;

    public LemonTree(int price, String name, String type, String[] flowerCare, Boolean eatable, DeliveryEnums delivery) {
        super(price, name, type, delivery);
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
    public void calculatePrice () {
        int a = getPrice() + flowerpot;
        System.out.println(a);
    }

    @Override
    public int sendFlowers() {
        int i;
        i = getPrice() + getDelivery().getValue();
        return i;
    }
}
