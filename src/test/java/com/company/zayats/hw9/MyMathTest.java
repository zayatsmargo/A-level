package com.company.zayats.hw9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

class MyMathTest {

    @Test
    public void correctInputTest() {
        String input = "123";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int res = MyMath.calculate(new Scanner(System.in));
        Assertions.assertEquals(6,res);
    }
}
