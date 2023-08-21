package com.hillel.homework19;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    public static Calculator calculator;

    @BeforeAll
    public static void init() {
        calculator = new Calculator();
        System.out.println("Calculator was created");
    }

    @Test
    public void testSumm() {
        Assertions.assertEquals(5, calculator.summ(2, 3));
        Assertions.assertEquals(-2, calculator.summ(-5, 3));
    }

    @Test
    public void testSubtract() {
        Assertions.assertEquals(7, calculator.subtract(10, 3));
        Assertions.assertEquals(-8, calculator.subtract(-5, 3));
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(15, calculator.multiply(3, 5));
        Assertions.assertEquals(-15, calculator.multiply(3, -5));
    }

    @Test
    public void testDivide() {
        Assertions.assertEquals(4, calculator.divide(12, 3));
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

    @AfterAll
    public static void finish() {
        System.out.println("All tests finished");
    }
}
