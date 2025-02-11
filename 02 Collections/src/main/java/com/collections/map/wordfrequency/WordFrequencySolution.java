package com.collections.map.wordfrequency;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

// Class to count the frequency of words in a list
public class WordFrequencySolution {

    // Counts the frequency of each word in the list
    public Map<String, Integer> countWordFrequency(List<String> words) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        return frequencyMap;
    }
}