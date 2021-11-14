package tamagochi;

import tamagochi.model.Animal;
import tamagochi.model.AnimalType;
import tamagochi.service.UserInputService;

public class Main {
    public static void main(String[] args) {
        UserInputService userInputService = new UserInputService();
        final Animal animal = userInputService.userInputAnimalTypeAndName();
        //final Animal animal = new Animal("Test", AnimalType.DOG);
        userInputService.doActions(animal);
    }
}
