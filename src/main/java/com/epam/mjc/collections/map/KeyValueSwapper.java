package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            if (map.containsKey(entry.getValue())) {
                for (Map.Entry<String, Integer> entry2 : map.entrySet()) {
                    if (entry2.getKey().equals((entry.getValue()))) {
                        if (entry.getKey() >= entry2.getValue()) {
                            map.put(entry.getValue(), entry2.getValue());
                        } else {
                            map.put(entry.getValue(), entry.getKey());
                        }
                    }
                }
            } else {
                map.put(entry.getValue(), entry.getKey());
            }
        }
        return map;
    }
}

