package com.company.zayats.hw17;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Reduce {
    private static final Random random = new Random();

    public static void findMin(List<Integer> integerList) {
        integerList.stream()
                .reduce(((integer, integer2) -> integer < integer2 ? integer : integer2))
                .ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> integerList= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(random.nextInt(100));
        }
        findMin(integerList);
    }
}
