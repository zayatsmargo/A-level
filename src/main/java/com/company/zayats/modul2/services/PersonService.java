package com.company.zayats.modul2.services;

import com.company.zayats.modul2.models.Customer;

import java.util.Random;

public class PersonService {
    private static int id = 1;
    private final Random random = new Random();

    public Customer generateCustomer() {
        return new Customer(generateEmail(), random.nextInt(65) + 16, id++);
    }

    private String generateEmail() {
        StringBuilder stringBuilder = new StringBuilder();
        String string = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 8; i++) {
            int number = random.nextInt(52);
            stringBuilder.append(string.charAt(number));
        }
        stringBuilder.append("@gmail.com");
        return stringBuilder.toString();
    }
}
