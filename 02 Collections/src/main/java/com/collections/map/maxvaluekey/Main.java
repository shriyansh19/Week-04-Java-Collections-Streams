package com.collections.map.maxvaluekey;

import java.util.Map;

// Main class to demonstrate finding the key with the maximum value
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 10, "B", 20, "C", 15);

        MaxValueKeySolution finder = new MaxValueKeySolution();
        String keyWithMaxValue = finder.findKeyWithMaxValue(map);

        System.out.println("Key with maximum value: " + keyWithMaxValue);
    }
}