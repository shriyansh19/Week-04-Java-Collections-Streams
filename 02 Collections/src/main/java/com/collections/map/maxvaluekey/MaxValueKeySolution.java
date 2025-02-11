package com.collections.map.maxvaluekey;

import java.util.Map;

// Class to find the key with the maximum value in a map
public class MaxValueKeySolution {

    // Finds the key with the maximum value
    public <K, V extends Comparable<V>> K findKeyWithMaxValue(Map<K, V> map) {
        return map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow(() -> new IllegalArgumentException("Map is empty"));
    }
}