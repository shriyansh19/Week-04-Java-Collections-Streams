package com.collections.list.frequencyofelements;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class FrequencyMainTest {

    @Test
    void testCountFrequency() {
        FrequencySolution frequencyCounter = new FrequencySolution();
        List<String> fruits = List.of("apple", "banana", "apple", "orange");

        Map<String, Integer> frequencyMap = frequencyCounter.countFrequency(fruits);
        assertEquals(Map.of("apple", 2, "banana", 1, "orange", 1), frequencyMap);
    }
}