package com.company.zayats.hw12.ClassWithExceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassWithThreeEx {
    static Scanner scanner = new Scanner(System.in);
    static int [] arr = new int[7];

    public static void doAction(int number) throws IllegalArgumentException, InputMismatchException, ArrayIndexOutOfBoundsException {
        System.out.println("Enter the number");
        int result;
        if (!scanner.hasNextInt()) {
            throw new InputMismatchException("It is not an integer");
        }
        else if (number == 50){
            throw new IllegalArgumentException("Invalid method argument");
        }
        else {
            result = scanner.nextInt() / (number - 50);
        }

        if (result < 0 || result >= arr.length ) {
            throw new ArrayIndexOutOfBoundsException("Out of bounds of array");
        }
        else {
            arr[result] = result;
            System.out.println(Arrays.toString(arr));
        }
    }
}
