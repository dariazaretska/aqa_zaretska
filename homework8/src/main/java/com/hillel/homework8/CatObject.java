package com.hillel.homework8;

import java.util.Scanner;

public class CatObject {
    int age;
    int foodToEat;
    String name;
    String colour;
    CatBreed catBreed;

    public CatObject(int age, int foodToEat, String name) {
        this.age = age;
        this.foodToEat = foodToEat;
        this.name = name;
    }

    public CatObject(String colour, CatBreed catBreed) {
        this.colour = colour;
        this.catBreed = catBreed;
    }

    public Scanner scanner = new Scanner(System.in);
    public void catName(){
        System.out.println("xто це у нас такий симпатичний котик? щоб дізнатісь ім'я - введіть 1");
        int enterOne = scanner.nextInt();
        if (enterOne == 1) {
            System.out.println("так це ж " + name);
        } else System.out.println("хмм.. це не 1");

    }

    public void feedCat() {
        System.out.println("нагодуйте котика. скільки грамів паштету йому дасте?");
        int foodToEat = scanner.nextInt();
        if (foodToEat > this.foodToEat) {
            System.out.println("кіт переїв та гикає!");
        }
        else if (foodToEat == this.foodToEat) {
                System.out.println("кіт наївся та муркотить!");
        }
        else System.out.println("кіт вимагає ще!");
    }

    public void activityCat() {
        System.out.println("що буде робити ця киця? введіть час у форматі від 0 до 24");
        int time = scanner.nextInt();
        if (time >= 0 && time <= 4) {
            System.out.println("кіт гарсає по хаті");
        }
        else if (time >= 5 && time <= 9) {
            System.out.println("кіт кличе вас снідати");
        }
        else if (time >= 10 && time <= 24) {
            System.out.println("кіт солоденько спить");
        }
        else System.out.println("хм... це не час у форматі від 0 до 24");
    }
    public void catColourAndBride(){
        System.out.println("щоб дізнатись колір та породу котика - введіть 1");
        int enterOne = scanner.nextInt();
        if (enterOne == 1) {
            System.out.println("Він " + colour + ", " + catBreed.printBreedCharacteristics());
        } else System.out.println("хмм.. це не 1");

    }
}

