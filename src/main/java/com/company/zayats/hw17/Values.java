package com.company.zayats.hw17;

import java.util.Random;

public class Values {
    private static final Random random = new Random();
    public static int min = 100;
    public static int max = 1;

    public static Item createItem() {
        String srt = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < srt.length(); i++) {
            int number = random.nextInt(52);
            stringBuilder.append(srt.charAt(number));
        }
        int cost = random.nextInt(100);
        return new Item(stringBuilder.toString(), cost);
    }
}
