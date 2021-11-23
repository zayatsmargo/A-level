package com.company.zayats.hw10;

public abstract class Car implements Recovery{
    private final Recovery recovery = new Recovery(){
        @Override
        public void refuel() {
            fuel = 60;
        }
    };
    private final String series;
    private final int year;
    private final String colour;
    protected double fuel;

    public Car(String series, int year, String colour, double fuel) {
        this.series = series;
        this.year = year;
        this.colour = colour;
        this.fuel = fuel;
    }

    public void move(){
        fuel -= 5;
        if (fuel == 0){
            move();
        }
    }

    public void showStatics(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "series='" + series + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                ", fuel=" + fuel +
                '}';
    }

    @Override
    public void refuel() {
        recovery.refuel();
    }
}
