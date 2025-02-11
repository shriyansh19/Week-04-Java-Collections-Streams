package com.collections.list.frequencyofelements;

import java.util.List;
import java.util.Map;

// Main class to demonstrate counting element frequencies
public class FrequencyMain {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "apple", "orange");
        System.out.println("Original List: " + fruits);

        FrequencySolution frequencyCounter = new FrequencySolution();
        Map<String, Integer> frequencyMap = frequencyCounter.countFrequency(fruits);

        System.out.println("Frequency Map: " + frequencyMap);
    }
}