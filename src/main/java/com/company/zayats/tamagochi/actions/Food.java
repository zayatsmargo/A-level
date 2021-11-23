package com.company.zayats.tamagochi.actions;

import com.company.zayats.tamagochi.model.Animal;

public class Food {
    public void doAction(Animal animal) {
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
        animal.addHungry(5);
        animal.setClear(animal.getClear() - 2 * coefficient);
        System.out.println("Clear - " + 2 * coefficient);
        System.out.println("Hungry + 5");
    }
}
