package com.hillel.homework7;

import java.util.Scanner;

public class CalcMethods {
    static Scanner scanner = new Scanner(System.in);

    public static int getInt1() {
        System.out.println("Введите целое число:");
        int number1;
        if (scanner.hasNextInt()) {
            number1 = scanner.nextInt();
        } else {
            System.out.println("Вы ввели не целое число. Попробуйте еще раз.");
            scanner.next();
            number1 = getInt1();
        }
        return number1;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы введи недопустимую операцию. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calcResult(int number1, int number2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Ошибка. Повторите ввод.");
                result = calcResult(number1, number2, getOperation());
        }
        return result;
    }
}
