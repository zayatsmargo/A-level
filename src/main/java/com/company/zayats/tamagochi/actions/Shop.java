package com.company.zayats.tamagochi.actions;

import com.company.zayats.tamagochi.model.Animal;

import java.util.Random;
import java.util.Scanner;

public class Shop {
    private final Random random = new Random();
    public void buyGift(Animal animal) {
        final Gift[] gifts = Gift.values();
        System.out.println("Выберите цену подарка : ");
        System.out.println("1 - 100\n2 - 150\n3 - 200");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                if (animal.getMoney() < 100) {
                    System.out.println("Недостаточно денег");
                    break;
                }
                animal.addHappy(20);
                animal.addMoney(-100);
                System.out.println("Happy + 20");
                break;
            case 2:
                if (animal.getMoney() < 150) {
                    System.out.println("Недостаточно денег");
                    break;
                }
                animal.addHappy(25);
                animal.addMoney(-150);
                System.out.println("Happy + 25");
                break;
            case 3:
                if (animal.getMoney() < 200) {
                    System.out.println("Недостаточно денег");
                    break;
                }
                animal.addHappy(30);
                animal.addMoney(-200);
                System.out.println("Happy + 30");
                break;
        }
        animal.addGift(gifts[random.nextInt(gifts.length - 1)]);
    }
}

