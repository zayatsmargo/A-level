package com.company.zayats.hw9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {


    @Test
    public void resultAddition() {
        double res = Calculator.calculate('+', 3, 2);
        Assertions.assertEquals(5,res);
    }

    @Test
    public void resultMultiplication() {
        double res = Calculator.calculate('*', 3, 2);
        Assertions.assertEquals(6,res);
    }

    @Test
    public void resultDivision() {
        double res = Calculator.calculate('/', 4, 2);
        Assertions.assertEquals(2,res);
    }

    @Test
    public void resultSubtraction() {
        double res = Calculator.calculate('-', 3, 2);
        Assertions.assertEquals(1,res);
    }

    @Test
    public void resultException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Calculator.calculate('3', 3, 2));
    }

    @Test
    public void resultDivisionByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Calculator.calculate('/', 3, 0));
    }
}