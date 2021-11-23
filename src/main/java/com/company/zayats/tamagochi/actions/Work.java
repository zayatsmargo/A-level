package com.company.zayats.tamagochi.actions;

import com.company.zayats.tamagochi.model.Animal;

import java.util.Random;

public class Work {
    private final Random random = new Random();
    private int workCount = 0;

    public void doAction(Animal animal) {
        if(animal.getHappy() < 20) {
            System.out.println("Error");
            return;
        }
        double coefficient = 1;
        if (animal.isUnhappy()) {
            coefficient *= 1.2;
        }
        if (animal.isIll()) {
            coefficient *= 2;
        }
        if (animal.getHungry() < 50){
            coefficient *= 1.5;
        }
        if (animal.getAge() < 5) {
            System.out.println("Error!");
            return;
        }

        animal.addMoney(random.nextInt(15) + 5);

        animal.addHungry(-4 * coefficient);
        animal.addHappy(-2 * coefficient);
        System.out.println("Hungry - " + 4 * coefficient);
        System.out.println("Happy - " + 2 * coefficient);


        if (++workCount == 6) {
            workCount = 0;
            animal.addAge(1);
            System.out.println("Age + 1");
        }
        final int randomNumber = random.nextInt(100);
        if (randomNumber <= 10) {
            animal.setIll(true);
            System.out.println("Питомец заболел");
        }

    }
}
