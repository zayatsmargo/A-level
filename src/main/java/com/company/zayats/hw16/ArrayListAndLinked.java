package com.company.zayats.hw16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListAndLinked {

    private final List<Integer> arrayList = new ArrayList<>();
    private final List<Integer> linkedList = new LinkedList<>();

    public void fillLists() {
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
    }

    public void chooseElement() {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.get(random.nextInt(1000000));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList time " + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.get(random.nextInt(1000000));
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList time " + (endTime - startTime));
    }

    public static void main(String[] args) {
        ArrayListAndLinked arrayListAndLinked = new ArrayListAndLinked();
        arrayListAndLinked.fillLists();
        arrayListAndLinked.chooseElement();
    }
}


