package com.company.zayats.hw16;

import java.util.*;

public class Dictionary {

    private Map<String, Integer> dictionary = new HashMap<>();

    public Dictionary() {
        dictionary.put("juice", 2);
        dictionary.put("money", 5);
        dictionary.put("car", 1);
        dictionary.put("lion", 6);
        dictionary.put("weather", 8);
        System.out.println(dictionary);
    }

    public Map<String, Integer> sortDictionary() {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(dictionary.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        System.out.println(dictionary.sortDictionary());
    }
}
