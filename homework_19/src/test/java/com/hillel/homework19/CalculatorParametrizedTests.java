package com.hillel.homework19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorParametrizedTests {

    public static Calculator calculator;

    @BeforeAll
    public static void init() {
        calculator = new Calculator();
        System.out.println("Calculator was created");
    }

    @ParameterizedTest
    @MethodSource("getValues")
    public void testSumm(int a, int b, int summ) {
        int actualResult = calculator.summ(a, b);
        Assertions.assertEquals(summ, actualResult, "Actual result = " + actualResult + "Expected = " + summ);
    }

    public static Stream<Arguments> getValues () {
        return Stream.of(
                Arguments.of(2,2,4),
                Arguments.of(5,2,7),
                Arguments.of(1,1,2)
        );
    }
}
