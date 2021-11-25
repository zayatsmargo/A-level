package com.company.zayats.hw10;

public abstract class Truck extends Car {
    private int cargo;

    public Truck(String series, int year, String colour, double fuel, double consumption) {
        super(series, year, colour, fuel, consumption * 2);
    }

    public void load(int weight) {
        cargo += weight;
    }

    public void unload(int weight) {
        cargo -= weight;
    }
}
