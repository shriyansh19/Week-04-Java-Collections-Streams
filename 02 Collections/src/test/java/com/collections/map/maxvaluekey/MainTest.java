package com.collections.map.maxvaluekey;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class MaxValueKeyTest {

    @Test
    void testFindKeyWithMaxValue() {
        MaxValueKeySolution finder = new MaxValueKeySolution();
        Map<String, Integer> map = Map.of("A", 10, "B", 20, "C", 15);

        String keyWithMaxValue = finder.findKeyWithMaxValue(map);
        assertEquals("B", keyWithMaxValue);
    }
}