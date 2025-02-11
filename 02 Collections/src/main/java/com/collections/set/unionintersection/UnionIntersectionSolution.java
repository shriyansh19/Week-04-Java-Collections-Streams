package com.collections.set.unionintersection;

import java.util.Set;
import java.util.HashSet;

// Class to compute union and intersection of two sets
public class UnionIntersectionSolution {

    // Computes the union of two sets
    public <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    // Computes the intersection of two sets
    public <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }
}