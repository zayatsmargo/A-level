package com.company.zayats.hw17;

import com.sun.org.apache.xpath.internal.operations.Number;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntSummarySt {
    private static final Random random = new Random();
    public static void summaryStatistic(List<Integer> integerList) {
        IntSummaryStatistics summaryStatistics = integerList.stream()
                .flatMapToInt(IntStream::of)
                .filter(integer -> integer >= 0)
                .summaryStatistics();
        System.out.println(summaryStatistics);
    }

    public static void main(String[] args) {
        List<Integer> integerList= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(random.nextInt(100)-50);
        }
        summaryStatistic(integerList);
    }
}
