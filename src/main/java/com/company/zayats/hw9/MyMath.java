package com.company.zayats.hw9;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class MyMath {

    public static int calculate(InputStream n) throws IOException {
        int sum = 0;
        int number = n.read();
        if (number < 0) {
            return -1;
        }
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}
