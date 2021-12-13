package com.company.zayats.hw15.homeworkSlide33;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SortedSet<Box> set = new TreeSet<>(new BoxVolumeComparator());
        set.add(new Box(0));
        set.add(new Box(7));
        set.add(new Box(14));
        set.add(new Box(0));
        set.add(new Box(3));

        for (Box box : set) {
            System.out.println("Volume in Box: " + box.volume);
        }
    }
}
