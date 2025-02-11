package com.collections.set.symmetricdifference;

import java.util.Set;

// Main class to demonstrate symmetric difference of sets
public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 4, 5);

        SymmetricDifferenceSolution solver = new SymmetricDifferenceSolution();
        Set<Integer> symmetricDiff = solver.symmetricDifference(set1, set2);

        System.out.println("Symmetric Difference: " + symmetricDiff);
    }
}