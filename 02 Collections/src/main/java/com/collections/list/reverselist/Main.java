package com.collections.list.reverselist;

import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate reversing a list
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println("Original List: " + numbers);

        ReverseListSolution reverser = new ReverseListSolution();
        reverser.reverseList(numbers);

        System.out.println("Reversed List: " + numbers);
    }
}