package com.company.zayats.tamagochi.service;

import com.company.zayats.tamagochi.actions.*;
import com.company.zayats.tamagochi.model.Animal;
import com.company.zayats.tamagochi.model.AnimalType;

import java.util.Scanner;

public class UserInputService {


    private final Scanner scanner = new Scanner(System.in);
    private final Food food = new Food();
    private final Work work = new Work();
    private final Games games = new Games();
    private final Treatment treatment = new Treatment();
    private final Shop shop = new Shop();


    public Animal userInputAnimalTypeAndName() {
        System.out.println("Доступные типы персонажа:");
        final AnimalType[] values = AnimalType.values();
        StringBuilder animalTypeString = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            animalTypeString.append(i).append(") ")
                    .append(values[i]).append("\n");
        }
        System.out.println(animalTypeString);
        int userInputAnimalType;
        do {
            System.out.println("Введите номер животного:");
            userInputAnimalType = scanner.nextInt();
        } while (userInputAnimalType < 0 || userInputAnimalType >= values.length);


        String userInputAnimalName;
        do {
            System.out.println("Введите имя животного от 3 до 20 символов:");
            userInputAnimalName = scanner.next();
        } while (userInputAnimalName.length() < 3 || userInputAnimalName.length() > 20);

        return new Animal(userInputAnimalName, values[userInputAnimalType]);
    }

    public void doActions(Animal animal) {
        StringBuilder builder = new StringBuilder("Выберете действие:\n");
        builder.append(0).append(") Выйти\n");
        builder.append(1).append(") Кормить\n");
        builder.append(2).append(") Работать\n");
        builder.append(3).append(") Играть\n");
        builder.append(4).append(") Лечить\n");
        builder.append(5).append(") Купить подарок\n");
        builder.append(6).append(") Смотреть состояние\n");


        int userAction;
        while (true) {
            System.out.print(builder);
            userAction = scanner.nextInt();

            switch (userAction) {
                case 0: {
                    System.exit(0);
                    break;
                }
                case 1: {
                    food.doAction(animal);
                    break;
                }
                case 2: {
                    work.doAction(animal);
                    break;
                }
                case 3: {
                    games.doAction(animal);
                    break;
                }
                case 4: {
                    treatment.doAction(animal);
                    break;
                }
                case 5: {
                    shop.buyGift(animal);
                    break;
                }
                case 6: {
                    System.out.println(animal);
                    break;
                }
                default : {
                    System.out.println("ERROR");
                }
            }
        }
    }
}