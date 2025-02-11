package com.collections.map.wordfrequency;

import java.util.List;
import java.util.Map;

// Main class to demonstrate counting word frequencies
public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("hello", "world", "hello", "java");

        WordFrequencySolution counter = new WordFrequencySolution();
        Map<String, Integer> frequencyMap = counter.countWordFrequency(words);

        System.out.println("Word Frequencies: " + frequencyMap);
    }
}