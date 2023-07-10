package com.hillel.homework11.flowershop;

public class Main {
    public static void main(String[] args) {
        LemonTree lemon1 = new LemonTree();
        String[] careRules = {"put on a sunny place"};
        LemonTree lemon2 = new LemonTree(345, "lemon","plant", careRules, true);
        lemon2.calculatePrice();
        Rose rose1 = new Rose();
        Rose rose2 = new Rose(89, "rose", "cutted", "white", "nostalgie", true);
    }
}
