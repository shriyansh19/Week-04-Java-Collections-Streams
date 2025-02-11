package com.collections.set.checkequals;

import java.util.Set;

// Main class to demonstrate checking if two sets are equal
public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 2, 1);

        CheckEqualsSolution checker = new CheckEqualsSolution();
        boolean result = checker.areSetsEqual(set1, set2);

        System.out.println("Are the sets equal? " + result);
    }
}