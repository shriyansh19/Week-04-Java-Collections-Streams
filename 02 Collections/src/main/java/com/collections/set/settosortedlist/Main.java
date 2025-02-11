package com.collections.set.settosortedlist;

import java.util.List;
import java.util.Set;

// Main class to demonstrate converting a set to a sorted list
public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = Set.of(5, 3, 9, 1);

        SetToSortedListSolution converter = new SetToSortedListSolution();
        List<Integer> sortedList = converter.convertToSortedList(numbers);

        System.out.println("Sorted List: " + sortedList);
    }
}