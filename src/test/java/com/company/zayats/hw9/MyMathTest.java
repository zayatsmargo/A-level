package com.company.zayats.hw9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyMathTest {

    @Test
    public void correctInputTest() {
        int res = MyMath.calculate(123);
        Assertions.assertEquals(6,res);
    }
}