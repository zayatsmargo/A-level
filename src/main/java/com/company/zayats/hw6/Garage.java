package com.company.zayats.hw6;

public class Garage{


    public static void checkCar(Car car) {
        if (!car.isEnoughPetrolLevel()) {
            System.out.println("Проверка на состояние бензина не пройдена.Уровень бензина < 50");

        }
        else if(car.getEngine().getPower()<=200){
            System.out.println("Проверка на мощность двигателя не пройдена.Двигатель < 200");
        }
        else {
            System.out.println("Все проверки успешно пройдены");
        }
    }
}
