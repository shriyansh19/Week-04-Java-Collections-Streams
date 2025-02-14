package com.exception.nested;

/**
 * Main class to demonstrate nested try-catch blocks.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        // Valid case
        NestedTryCatch.performOperation(array, 1, 2);
        // Invalid index
        NestedTryCatch.performOperation(array, 5, 2);
        // Division by zero
        NestedTryCatch.performOperation(array, 1, 0);
    }
}