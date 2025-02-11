package com.collections.map.invertmap;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

// Class to invert a map (swap keys and values)
public class InvertMapSolution {

    // Inverts the map, handling duplicate values by storing them in a list
    public <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        return invertedMap;
    }
}