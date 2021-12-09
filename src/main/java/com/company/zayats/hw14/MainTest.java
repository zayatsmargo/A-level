package com.company.zayats.hw14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
            Util<String> util = new Util<>();
            util.printHashCode("Test");
            util.save("Value");
            System.out.println(util.get());
            Number[] arr = {1, 2, 3, 4, 0, 5, 6, 7};
            System.out.println(Arrays.toString(util.doubleValueIn(arr)));
            System.out.println(util.sumOfArray(Arrays.asList(arr)));
            List<Integer> list = new ArrayList<>();
            util.addNumbers(list);
            System.out.println(Arrays.toString(list.toArray()));
        }
    }