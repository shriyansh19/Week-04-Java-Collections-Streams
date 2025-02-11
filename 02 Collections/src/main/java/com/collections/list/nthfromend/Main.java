package com.collections.list.nthfromend;

import java.util.LinkedList;
import java.util.List;

// Main class to demonstrate finding the Nth element from the end
public class Main {
    public static void main(String[] args) {
        List<String> letters = new LinkedList<>(List.of("A", "B", "C", "D", "E"));
        System.out.println("Original List: " + letters);

        NthFromEndSolution finder = new NthFromEndSolution();
        String result = finder.findNthFromEnd(letters, 2);

        System.out.println("2nd element from the end: " + result);
    }
}