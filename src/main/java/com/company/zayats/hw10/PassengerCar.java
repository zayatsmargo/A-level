package com.company.zayats.hw10;

import java.util.Arrays;

public class PassengerCar extends Car {
    private int passengersNumber;
    private final Passenger[] passengers = new Passenger[3];

    public PassengerCar(String series, int year, String colour, double fuel, double consumption) {
        super(series, year, colour, fuel, consumption);
    }

    @Override
    public void showStatics() {
        System.out.println(this);
    }

    public void setPassenger(Passenger passenger) {
        if (passengersNumber >= 3) {
            System.out.println("Number of passengers can't be more than 3");
        } else {
            passengersNumber++;
            for (int i = 0; i < 3; i++) {
                if (passengers[i] == null) {
                    passengers[i] = passenger;
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "passengersNumber=" + passengersNumber +
                ", passengers=" + Arrays.toString(passengers) +
                '}';
    }
}
