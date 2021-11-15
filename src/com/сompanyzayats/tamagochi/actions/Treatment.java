package tamagochi.actions;

import tamagochi.model.Animal;

public class Treatment {
    public void doAction(Animal animal) {
        if(animal.getMoney() < 50){
            System.out.println("Недостаточно денег");
            return;
        }
        animal.addMoney(-50);
        if(animal.getHappy() > 10){
            animal.setHappy(10);
            System.out.println("Счастье снижено до 10");
        }
        if(animal.getHungry() > 70){
            animal.setHungry(70);
            System.out.println("Голод снижен до 70");
        }
        if(animal.getClear() < 80){
            animal.setClear(80);
            System.out.println("Чистота повышена до 80");
        }
        animal.setIll(false);
        System.out.println("Существо вылечено");
    }
}
