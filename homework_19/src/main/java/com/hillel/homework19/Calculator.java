package com.hillel.homework19;

public class Calculator {
    public int summ(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Impossible to divide by zero");
        }
        return a / b;
    }
}