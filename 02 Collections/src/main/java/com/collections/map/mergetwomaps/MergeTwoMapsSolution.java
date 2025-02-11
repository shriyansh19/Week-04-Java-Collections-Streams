package com.collections.map.mergetwomaps;

import java.util.HashMap;
import java.util.Map;

// Class to merge two maps, summing values for duplicate keys
public class MergeTwoMapsSolution {

    // Merges two maps, summing values for duplicate keys
    public Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> mergedMap = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            mergedMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return mergedMap;
    }
}