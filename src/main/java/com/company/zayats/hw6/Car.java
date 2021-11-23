package com.company.zayats.hw6;

public class Car {
    private Manufacturer manufacturer;
    private Engine engine;
    private String color;
    private int petrol;

    public Car(Manufacturer manufacturer, Engine engine, String color) {
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.color = color;
        petrol = 100;
    }

    public void startEngine(String name){
        System.out.println("{" + name + "} запустил двигатель" );
    }

    public boolean isEnoughPetrolLevel() {
        return petrol >= 50;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }



    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPetrol(int petrol) {
        this.petrol = petrol;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer.getRussianName() + '\'' +
                ", engine=" + engine +
                ", color='" + color + '\'' +
                ", petrol=" + petrol +
                '}';
    }


}

