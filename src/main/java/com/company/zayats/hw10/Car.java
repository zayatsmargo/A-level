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
    protected final double consumption;

    public Car(String series, int year, String colour, double fuel, double consumption) {
        this.series = series;
        this.year = year;
        this.colour = colour;
        this.fuel = fuel;
        this.consumption = consumption;
    }

    public void move(){
        if((fuel -= consumption) > 0 && consumption <= fuel){
            move();
        }
    }

     abstract void showStatics();

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
