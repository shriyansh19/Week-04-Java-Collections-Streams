package com.collections.list.removeduplicates;

import java.util.List;

// Main class to demonstrate removing duplicates
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 1, 2, 2, 3, 4);
        System.out.println("Original List: " + numbers);

        RemoveDuplicatesSolution remover = new RemoveDuplicatesSolution();
        List<Integer> uniqueList = remover.removeDuplicates(numbers);

        System.out.println("List after removing duplicates: " + uniqueList);
    }
}