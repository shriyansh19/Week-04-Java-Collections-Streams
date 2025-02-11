package com.collections.map.invertmap;

import java.util.List;
import java.util.Map;

// Main class to demonstrate inverting a map
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 1);

        InvertMapSolution inverter = new InvertMapSolution();
        Map<Integer, List<String>> invertedMap = inverter.invertMap(map);

        System.out.println("Inverted Map: " + invertedMap);
    }
}