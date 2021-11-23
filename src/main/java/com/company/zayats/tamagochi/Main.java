package com.company.zayats.tamagochi;

import com.company.zayats.tamagochi.model.Animal;
import com.company.zayats.tamagochi.service.UserInputService;

public class Main {
    public static void main(String[] args) {
        UserInputService userInputService = new UserInputService();
        final Animal animal = userInputService.userInputAnimalTypeAndName();
        //final Animal animal = new Animal("Test", AnimalType.DOG);
        userInputService.doActions(animal);
    }
}
