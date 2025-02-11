package com.collections.set.findsubsets;

import java.util.Set;

// Main class to demonstrate checking subsets
public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(2, 3);
        Set<Integer> set2 = Set.of(1, 2, 3, 4);

        FindSubsetsSolution checker = new FindSubsetsSolution();
        boolean result = checker.isSubset(set1, set2);

        System.out.println("Is set1 a subset of set2? " + result);
    }
}