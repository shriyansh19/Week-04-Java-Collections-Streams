package com.collections.set.findsubsets;

import java.util.Set;

// Class to check if one set is a subset of another
public class FindSubsetsSolution {

    // Checks if set1 is a subset of set2
    public <T> boolean isSubset(Set<T> set1, Set<T> set2) {
        return set2.containsAll(set1);
    }
}