package com.company.zayats.hw9;

import java.util.Scanner;

public class MyMath {

    public int calculate(Scanner n){
        int sum = 0;
        int number = n.nextInt();
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}
