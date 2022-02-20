package com.company.zayats.modul3.mapper;

import java.util.Map;
import java.util.stream.Collectors;

public class ActivityMapper {

    public static String mapToString(Map<?, ?> map) {
        return map.keySet()
                .stream()
                .map(key -> key + "=" + map.get(key))
                .collect(Collectors.joining("\n", "", ""));
    }
}
