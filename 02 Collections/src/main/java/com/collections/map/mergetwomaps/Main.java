package com.collections.map.mergetwomaps;

import java.util.Map;

// Main class to demonstrate merging two maps
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

        MergeTwoMapsSolution merger = new MergeTwoMapsSolution();
        Map<String, Integer> mergedMap = merger.mergeMaps(map1, map2);

        System.out.println("Merged Map: " + mergedMap);
    }
}