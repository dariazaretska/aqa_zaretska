package com.hillel.homework8;

public class Main {
    public static void main(String[] args) {

        CatObject cat1 = new CatObject(8, 150, "Тортік");
        CatBreed catBreed1 = new CatBreed("зелений", "мейнкун");
        CatObject cat2 = new CatObject("руденький", catBreed1);
        cat1.catName();
        cat1.feedCat();
        System.out.println(" ");
        System.out.println("ооо, тут ще один котик красунчик");
        cat2.catColourAndBride();
        cat2.activityCat();
        }
    }