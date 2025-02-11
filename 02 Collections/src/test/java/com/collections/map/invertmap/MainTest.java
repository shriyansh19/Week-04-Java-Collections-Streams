package com.collections.map.invertmap;

import org.junit.jupiter.api.Test;
import java.util.Map;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class InvertMapTest {

    @Test
    void testInvertMap() {
        InvertMapSolution inverter = new InvertMapSolution();
        Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 1);

        Map<Integer, List<String>> invertedMap = inverter.invertMap(map);
        assertEquals(Map.of(1, List.of("A", "C"), 2, List.of("B")), invertedMap);
    }
}