package com.collections.set.checkequals;

import java.util.Set;

// Class to check if two sets are equal
public class CheckEqualsSolution {

    // Checks if two sets contain the same elements
    public <T> boolean areSetsEqual(Set<T> set1, Set<T> set2) {
        return set1.equals(set2);
    }
}