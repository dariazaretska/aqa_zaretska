package com.hillel.homework11.flowershop;

public class Main {
    public static void main(String[] args) {
        String[] careRules = {"put on a sunny place"};
        LemonTree lemon1 = new LemonTree(345, "lemon","plant", careRules, true,
                                         "green", 2);
        System.out.println("Стоимость " + lemon1.calculatePrice());
        Rose rose1 = new Rose(89, "rose", "cuted", "white", "nostalgie", 5);
        System.out.println("Стоимость букета " + rose1.calculatePrice());
        Rose rose2 = new Rose(55,"кустовая роза", "срезанная", "розовая", "айсберг",
                    true, 7);
        System.out.println(rose2.toString());
        System.out.println(lemon1.toString());
    }
}
