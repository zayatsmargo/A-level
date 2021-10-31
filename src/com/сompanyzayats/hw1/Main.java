package com.сompanyzayats.hw1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Zayats Margarita");
        String name = "Margarita";
        if (name.length() > 7) {
            System.out.println("more than 7");
        } else {
            System.out.println("less then 7");
        }
        int number=3;
        for (int i = 0; i <= 10; i++) {
            number = number +2;
            System.out.println("Step: " + i +" Number = " + number);
        }
    }
}

