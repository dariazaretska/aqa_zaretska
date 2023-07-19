package com.hillel.homework11.flowershop.demo;

import com.hillel.homework11.flowershop.enums.DeliveryEnums;
import com.hillel.homework11.flowershop.implementation.LemonTree;
import com.hillel.homework11.flowershop.implementation.Rose;

public class Main {
    public static void main(String[] args) {
        LemonTree lemon1 = new LemonTree();
        String[] careRules = {"put on a sunny place"};
        LemonTree lemon2 = new LemonTree(345, "lemon","plant", careRules, true, DeliveryEnums.COURIER);
        lemon2.calculatePrice();
        Rose rose1 = new Rose();
        Rose rose2 = new Rose(89, "rose", "cuted", "white", "nostalgie", DeliveryEnums.PICKUP);
        System.out.println(rose2.sendFlowers());
        System.out.println(lemon2.sendFlowers());
    }
}
