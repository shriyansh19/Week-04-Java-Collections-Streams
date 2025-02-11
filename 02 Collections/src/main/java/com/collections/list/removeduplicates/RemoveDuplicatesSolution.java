package com.collections.list.removeduplicates;

import java.util.List;
import java.util.LinkedHashSet;
import java.util.ArrayList;

// Class to remove duplicates from a list while preserving order
public class RemoveDuplicatesSolution {

    // Removes duplicates from the list while maintaining order
    public <T> List<T> removeDuplicates(List<T> list) {
        // Use LinkedHashSet to remove duplicates and preserve order
        LinkedHashSet<T> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }
}