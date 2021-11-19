package com.company.zayats.tamagochi.model;

import com.company.zayats.tamagochi.actions.Gift;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private final String name;
    private final AnimalType type;
    private int age;
    private double hungry;
    private double money;
    private double clear;
    private double happy;
    private List<Gift> gifts;
    private boolean isUnhappy;
    private boolean isIll;

    public Animal(String name, AnimalType type) {
        this.name = name;
        this.type = type;
        this.age = 1;
        this.hungry = 100;
        this.money = 0;
        this.clear = 100;
        this.happy = 50;
        gifts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public AnimalType getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public void addAge(int age) {
        this.age += age;
    }

    public double getHungry() {
        return hungry;
    }

    public void addHungry(double hungry) {
        this.hungry += hungry;
    }

    public void setHungry(double hungry) {
        this.hungry = hungry;
    }

    public double getMoney() {
        return money;
    }

    public void addMoney(double money) {
        this.money += money;
    }

    public double getClear() {
        return clear;
    }

    public void setClear(double clear) {
        this.clear = clear;
    }

    public double getHappy() {
        return happy;
    }

    public void addHappy(double happy) {
        this.happy += happy;
        isUnhappy = this.happy < 10;
    }

    public void setHappy(double happy) {
        this.happy = happy;
    }

    public boolean isUnhappy() {
        return isUnhappy;
    }

    public boolean isIll() {
        return isIll;
    }

    public void setIll(boolean ill) {
        isIll = ill;
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", age=" + age +
                ", hungry=" + hungry +
                ", money=" + money +
                ", clear=" + clear +
                ", happy=" + happy +
                '}';
    }
}
