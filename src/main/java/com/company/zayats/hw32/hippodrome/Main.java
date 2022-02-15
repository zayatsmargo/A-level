package com.company.zayats.hw32.hippodrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter horse number");
       int maxHorse = scanner.nextInt();
        System.out.println("Enter the number of the horse you are betting on");
        int bid = scanner.nextInt();
        for (int i = 1; i <= maxHorse; i++) {
            String name = "Horse " + i;
            Hippodrome hippodrome1 = new Hippodrome();
            hippodrome1.setName(name);
            hippodrome1.start();
        }
    }
}
