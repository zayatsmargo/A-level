package com.company.zayats.hw17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Date {

    public static void checkDate(List<String> stringList) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        boolean b = stringList.stream()
                .map(s -> LocalDate.parse(s, formatter))
                .anyMatch(localDate -> localDate.getYear() == 2021);
        System.out.println(b);
    }

    public static void main(String[] args) {
       List <String> stringList = new ArrayList<>();
       stringList.add("2020/04/13");
       stringList.add("2021/09/07");
       stringList.add("2019/11/27");
       checkDate(stringList);
    }
}
