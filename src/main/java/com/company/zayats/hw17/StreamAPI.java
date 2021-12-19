package com.company.zayats.hw17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

        String[] stringArray = {
                "akf", "b", "d", "jk", "jp",
                "afc", "ambn", "kmk", "qrbd", "cus"
        };

        ArrayList<String> arrayList = new ArrayList<>(stringArray.length);
        for (int i = 0; i < stringArray.length; i++) {
            arrayList.add(i, stringArray[i]);
        }

        Stream<String> stream = arrayList.stream();
        Stream<String> streamSorted = stream.sorted();
        Consumer<String> action = System.out::println;
        streamSorted.forEach(action);
        Comparator<String> comparator;
        comparator = Comparator.reverseOrder();
        stream = arrayList.stream();
        Stream<String> streamSortedDesc = stream.sorted(comparator);
        System.out.println("-----------------------");
        streamSortedDesc.forEach(action);
    }
}
