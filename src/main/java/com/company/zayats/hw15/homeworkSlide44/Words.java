package com.company.zayats.hw15.homeworkSlide44;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class Words {
    public static Map<String, Integer> stringIntegerMap(List<String> list) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            for (String s : list) {
                stringIntegerMap.put(s, s.length());
            }
            return stringIntegerMap;
        }
    }
}
