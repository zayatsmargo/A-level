package com.company.zayats.hw17;

import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;

@Getter
public class Box {
    private static final Random random = new Random();
    private final List<Item> items;

    public Box() {
        this.items = fillBox();
    }

    private  List<Item> fillBox(){
        Random random = new Random();
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < random.nextInt(15); i++) {
            items.add(Values.createItem());
        }
        return items;
    }

    public static List<Box> fillWithBoxes() {
        List<Box> temp = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            temp.add(new Box());
        }
        return temp;
    }

    private static int limitForFilter() {
        return random.nextInt(Values.min - Values.max) + Values.max;
    }

    public static void filterAndSortList(List<Box> list) {
        List<Item> sortedItemList = list.stream()
                .filter(box -> box.getItems().size() <= limitForFilter())
                .flatMap(box -> box.getItems().stream())
                .sorted(Comparator.comparing(Item::getCost))
                .collect(Collectors.toList());
        System.out.println(sortedItemList);
    }

    public static void main(String[] args) {
        List<Box> boxes = fillWithBoxes();
        filterAndSortList(boxes);
        System.out.println(limitForFilter());
    }
}
