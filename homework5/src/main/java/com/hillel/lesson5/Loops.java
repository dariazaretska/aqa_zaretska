package com.hillel.lesson5;


import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {


        // Task 1
        for (int i = 1000; i <= 1015; i += 3) {
            System.out.println(i);
        }

        // Task 2
        for (int j = 10; j >= -10; j -= 4) {
            if (j > 0) {
                System.out.println(j);
            }
        }

        //Task3
//        int n, f;
//        f = 1;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите число, которое нужно возвести в факториал");
//        if (sc.hasNextInt()) {
//            n = sc.nextInt();
//            for (int i = 1; i <= n; i++) {
//                f = f * i;
//            }
//            System.out.println(n + "! = " + f);
//        }

        //Task 4
        int a, c = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите число, у которого нужно посчитать сумму всех его чисел");
        if (scn.hasNextInt()) {
            a = scn.nextInt();
            while (a != 0) {
                c = c + a % 10;
                a /= 10;
            }

            System.out.println("Сумма всех чисел = " + c);
        } else System.out.println("Ошибка!");
    }
}

