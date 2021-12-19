package com.company.zayats.hw17;

import lombok.Getter;

@Getter
public class Item {
    private final String name;
    private final int cost;

    public Item(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
