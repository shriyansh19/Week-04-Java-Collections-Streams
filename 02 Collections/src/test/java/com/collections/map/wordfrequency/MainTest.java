package com.collections.map.wordfrequency;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyTest {

    @Test
    void testCountWordFrequency() {
        WordFrequencySolution counter = new WordFrequencySolution();
        List<String> words = List.of("hello", "world", "hello", "java");

        Map<String, Integer> frequencyMap = counter.countWordFrequency(words);
        assertEquals(Map.of("hello", 2, "world", 1, "java", 1), frequencyMap);
    }
}