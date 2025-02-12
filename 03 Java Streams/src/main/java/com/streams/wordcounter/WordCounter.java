package com.streams.wordcounter;

import java.io.*;
import java.util.*;

public class WordCounter {
    /**
     * Reads a file and counts word occurrences.
     * @param filename The text file to read.
     */
    public void countWords(String filename) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Sort words by frequency
            List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCountMap.entrySet());
            sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

            // Display top 5 words
            System.out.println("Top 5 most frequently occurring words:");
            for (int i = 0; i < Math.min(5, sortedWords.size()); i++) {
                System.out.println(sortedWords.get(i).getKey() + ": " + sortedWords.get(i).getValue());
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
