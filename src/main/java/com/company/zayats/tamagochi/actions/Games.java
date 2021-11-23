package com.company.zayats.tamagochi.actions;

import com.company.zayats.tamagochi.model.Animal;

import java.util.Random;

public class Games {
    private final Random random = new Random();

    private int gamesCounter = 0;

    public void doAction(Animal animal){
        double coefficient = 1;
        if (animal.isUnhappy()) {
            coefficient *= 1.2;
        }
        if (animal.isIll()) {
            coefficient *= 2;
        }
        if (animal.getHungry() < 50) {
            coefficient *= 1.5;
        }
        animal.addHungry(-3 * coefficient);
        animal.addHappy(6);
        if(++gamesCounter == 5) {
            animal.addAge(1);
            gamesCounter = 0;
            System.out.println("Age + 1");
        }
        animal.addMoney(random.nextInt(9) + 1);
        System.out.println("Happy + 6");
        System.out.println("Hungry - " + 3 * coefficient);
        final int randomNumber = random.nextInt(100);
        if (randomNumber <= 10) {
            System.out.println("Питомец заболел");
            animal.setIll(true);
        }
    }
}

