package com.hillel.homework20;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class CalculatorTest {
    public static Calculator calculator;

    @BeforeSuite
    public static void testBeforeSuite() {
        System.out.println("Before suite test");
    }

    @BeforeClass
    public static void init() {
        calculator = new Calculator();
        System.out.println("Calculator was created");
    }

    @BeforeMethod
    public static void clearInputBeforeTest() {
        System.out.println("Input field cleared");
    }

    @Test
    public void testSumm() {
        assertEquals(calculator.summ(2, 3), 5);
        assertEquals(calculator.summ(-5, 3), -2);
    }

    @Test
    public void testSubtract() {
        assertEquals(calculator.subtract(10, 3), 7);
        assertEquals(calculator.subtract(-5, 3), -8);
    }

    @Test
    public void testMultiply() {
        assertEquals(calculator.multiply(3, 5), 15);
        assertEquals(calculator.multiply(3, -5), -15);
    }

    @Test
    public void testDivide() {
        assertEquals(calculator.divide(12, 3), 4);
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

}
