package com.company.zayats.hw9;

import java.util.Scanner;

public class Calculator {
    public static double calculate(char op, double x, double y) {
        if (op == '0') {
            System.exit(0);
        } else if (op == '+') {
            return x + y;
        } else if (op == '-') {
            return x - y;
        } else if (op == '*') {
            return x * y;
        } else if (op == '/') {
            if (y == 0) {
                throw new IllegalArgumentException();
            }
            return x / y;
        }

        else {
            System.out.println("Error! Enter correct operator");
            throw new IllegalArgumentException();
        }
        return -1;
    }

    public static void main(String[] args) {
        double x;
        double y;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);
        System.out.println("Enter two numbers");
        x = reader.nextDouble();
        y = reader.nextDouble();
        System.out.println("\nThe result is given as follows:\n");
        System.out.println(x + " " + op + " " + y + " = " + calculate(op, x, y));
    }
}

