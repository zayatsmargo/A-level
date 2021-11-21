package com.company.zayats.hw9;

import java.util.Scanner;

public class MyMath {
    public static void main(String[] args) {
        System.out.println("Please enter integer number");
        Scanner n = new Scanner(System.in);
        if (n.hasNextInt()) {
            System.out.print("Sum of all digits of the number you entered is " + calculate(n));
        }
    }
    public static int calculate(Scanner n){
        int sum = 0;
        int number = n.nextInt();
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}
