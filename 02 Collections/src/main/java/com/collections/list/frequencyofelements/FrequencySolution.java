package com.collections.list.frequencyofelements;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

// Class to count the frequency of elements in a list
public class FrequencySolution {

    // Returns a map with element frequencies
    public Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : list) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        return frequencyMap;
    }
}