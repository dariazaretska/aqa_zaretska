package com.hillel.homework7;

import static com.hillel.homework7.CalcMethods.*;

public class Main {
    public static void main(String[] args) {
        int number1 = getInt1();
        char operation = getOperation();
        int number2 = getInt1();
        int result = calcResult(number1, number2, operation);
        System.out.println("Результат: " + result);
    }
}