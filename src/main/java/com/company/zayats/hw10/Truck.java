package com.company.zayats.hw10;

public class Truck extends Car{
    private int cargo;

    public Truck(String series, int year, String colour, double fuel) {
        super(series, year, colour, fuel);
    }

    public void load(int weight){
        cargo += weight;
    }

    public void unload(int weight){
        cargo -= weight;
    }

    @Override
    public void move(){
        fuel -= 10;
        if (fuel == 0){
            move();
        }
    }
}
