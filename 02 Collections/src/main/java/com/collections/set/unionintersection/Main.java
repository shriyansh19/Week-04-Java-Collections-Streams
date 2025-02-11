package com.collections.set.unionintersection;

import java.util.Set;

// Main class to demonstrate union and intersection of sets
public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 4, 5);

        UnionIntersectionSolution solver = new UnionIntersectionSolution();
        Set<Integer> union = solver.union(set1, set2);
        Set<Integer> intersection = solver.intersection(set1, set2);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}