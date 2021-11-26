package com.company.zayats.hw10;

public class Main {
    public static void main(String[] args) {
        Car car = new Truck("AX", 2018, ",BLACK", 60, 7) {
            @Override
            void showStatics() {
                System.out.println(this);
            }
        };
        car.showStatics();
        car.move();
        car.showStatics();
        car.refuel();
        car.showStatics();
        PassengerCar passengerCar = new PassengerCar("AX", 2018, ",BLACK", 60, 7);
        passengerCar.setPassenger(new Passenger("Lesha",20));
        passengerCar.setPassenger(new Passenger("Fgdgf",67));
        passengerCar.setPassenger(new Passenger("kljlj",24));
        passengerCar.setPassenger(new Passenger("DFSf",12));
        passengerCar.showStatics();
    }
}

