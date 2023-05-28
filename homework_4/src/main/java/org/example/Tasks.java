package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        //Задача 1.
        //Во многих странах для измерения небольших размеров используется не только
        //единица длины «сантиметр», но и такая единица,
        //как «дюйм» (1 дюйм = 2.54 сантиметра).
        //Выведите в консоль 10 см,равное размеру в дюймах,
        //и затем 25 дюймов,но в сантиметрах.
float oneInchInCm = 2.54f;
float TenCmInInches = 10 / oneInchInCm;
        System.out.println(TenCmInInches);
float TwentyFiveInchesInCm = 25 * oneInchInCm;
        System.out.println(TwentyFiveInchesInCm);

        //Задача 2.
        //Подрабатывая в течение года, Вася собрал себе определенную сумму на поездку за границу,
        //а родители добавили ему от себя еще некоторую сумму.
        //Выведите в консоль сколько денег есть у Васи на отпуск (в евро) если:
        //Вася заработал 5000 грн,Родители добавили-5000,
        //курс евро 1 евро = 28 грн
//int VasyaMoney = 5000;
//int ParentsMoney = 5000;
//float OneEuroRateInGryvnya = 28.00f;
//float VasyaVacationMoneyInEur = ((VasyaMoney + ParentsMoney)/OneEuroRateInGryvnya);
//System.out.println(VasyaVacationMoneyInEur);

        //Задача 3.
        //Если x любое положительное двузначное число
        //Выведите на екран его десятки и еденицы (2 числа)
        //разделенные знаком «пробел», но в обратном порядке.
        //То есть для числа 45 будет выведено на экран 5 4.
//Scanner scanner = new Scanner(System.in);
//int number = scanner.nextInt();
//if (number > 0 && number < 100) {
//System.out.println(number % 10 + " " + number / 10);
// }

        //Задача 4.
        //Если x любое положительное двузначное число
        //Выведите на екран его в «полном виде»: например,
        //для числа 34 это будет выглядеть как 30+4.
//Scanner scanner = new Scanner(System.in);
//int number1 = scanner.nextInt();
//if (number1 > 0 && number1 < 100) {
//System.out.println(number1 / 10 * 10 + "+" + number1 % 10);
// }

        //Задача 5.
        //Назовем весом числа сумму его цифр.
        //Если x любое положительное двузначное число
        //Выведите на екран его «вес».
//Scanner scanner = new Scanner(System.in);
//int k = scanner.nextInt();
//int l = k / 10;
//int m = k % 10;
//if (k > 0 && k < 100) {
//    System.out.println(l + m); }

        //Задача 6.
        //Если x любое число,выведите на экран одно из следующих сообщений:
        //Положительное, или Отрицательное, или Ноль, -в зависимости от значения числа.
//Scanner scanner = new Scanner(System.in);
//int a = scanner.nextInt();
//if (a == 0) {
//System.out.println("Ноль");
//    }
//else if (a > 0) {
//System.out.println("Положительное");
//    }
//else if (a < 0) {
//System.out.println("Отрицательное");
// }

         //Задача 7.
    //Если x любое число,
    //если оно как минимум трехзначное и положительное,
    //уменьшает его на 1 и выводит на экран.
//Scanner scanner = new Scanner(System.in);
//int b = scanner.nextInt();
//if (b > 99) {
//b = b - 1;
//System.out.println(b);
//}

         //Задача 8.
    //Если x любое положительное двузначное число выведите на экран что больше:
    //само это число или произведение его цифр.
//Scanner scanner = new Scanner(System.in);
//  int c = scanner.nextInt();
//  int d = c / 10;
//  int e = c % 10;
//  if (c>0 && c<100 && c>d*e) {
//  System.out.println(c);
//}
//  if (c>0 && c<100 && c<d*e) {
//System.out.println(d*e);
// }


    }
}
