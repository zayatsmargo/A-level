package com.company.zayats.hw2;

public class Main {
    public static void main(String[] args) {
        int x = 10, y = 24, z = 30;
        double p = (x+y+z)/2;
        double s = Math.sqrt(p*(p-x)*(p-y)*(p-z));

        System.out.println("S - " + s);

        int a = 0;
        int b = 10;
        int random_number1 = a + (int) (Math.random() * b);
        int random_number2 = a + (int) (Math.random() * b);
        int random_number3 = a + (int) (Math.random() * b);

        System.out.println("Number 1 - " + random_number1);
        System.out.println("Number 2 - " + random_number2);
        System.out.println("Number 3 - " + random_number3);

        double lesser = (Math.abs(random_number1) < Math.abs(random_number2)) ? random_number1 : random_number2;
        double min = (Math.abs(lesser) < Math.abs(random_number3)) ? lesser : random_number3;

        System.out.println("Min - " + min);
        int max = 100;
        int generatedNumber = a + (int) (Math.random() * max);
        Boolean result = (generatedNumber % 2 == 0) ? true : false;

        System.out.println("Generated number - " + generatedNumber);
        System.out.println(result);

    }
}
