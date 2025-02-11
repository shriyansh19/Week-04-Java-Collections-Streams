package com.collections.set.symmetricdifference;

import java.util.Set;
import java.util.HashSet;

// Class to compute the symmetric difference of two sets
public class SymmetricDifferenceSolution {

    // Computes the symmetric difference of two sets
    public <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2) {
        Set<T> symmetricDiff = new HashSet<>(set1);
        symmetricDiff.addAll(set2); // Union of set1 and set2
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // Intersection of set1 and set2
        symmetricDiff.removeAll(intersection); // Remove intersection from union
        return symmetricDiff;
    }
}