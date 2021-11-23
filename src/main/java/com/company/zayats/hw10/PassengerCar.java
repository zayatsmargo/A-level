package com.company.zayats.hw10;

public class PassengerCar extends Car {
    private int passengersNumber;
    private final Passenger[] passengers = new Passenger[3];

    public PassengerCar(String series, int year, String colour, double fuel) {
        super(series, year, colour, fuel);
    }

    public void setPassenger(Passenger passenger){
        if (passengersNumber >= 3) {
            System.out.println("Number of passengers can't be more than 3");
        }
        else {
            passengersNumber++;
            for (int i = 0; i < 3; i++) {
                if (passengers[i] != null){
                    passengers[i] = passenger;
                }
            }
        }
    }
}
