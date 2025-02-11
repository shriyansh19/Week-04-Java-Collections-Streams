package com.collections.list.rotateelements;

import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate rotating a list
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        System.out.println("Original List: " + numbers);

        RotateSolution rotator = new RotateSolution();
        rotator.rotateList(numbers, 2);

        System.out.println("Rotated List: " + numbers);
    }
}