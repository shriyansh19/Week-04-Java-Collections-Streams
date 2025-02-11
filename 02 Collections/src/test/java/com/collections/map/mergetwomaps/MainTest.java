package com.collections.map.mergetwomaps;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class MergeTwoMapsTest {

    @Test
    void testMergeMaps() {
        MergeTwoMapsSolution merger = new MergeTwoMapsSolution();
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

        Map<String, Integer> mergedMap = merger.mergeMaps(map1, map2);
        assertEquals(Map.of("A", 1, "B", 5, "C", 4), mergedMap);
    }
}