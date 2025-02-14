package com.exception.nested;

/**
 * Demonstrates nested try-catch blocks for handling multiple exceptions.
 */
public class NestedTryCatch {
    /**
     * Performs array access and division using nested try-catch.
     * @param array The input array.
     * @param index The index to access.
     * @param divisor The divisor for division.
     */
    public static void performOperation(int[] array, int index, int divisor) {
        try {
            // Outer try block: Access array element
            int value = array[index];
            try {
                // Inner try block: Perform division
                System.out.println("Result: " + (value / divisor));
            } catch (ArithmeticException e) {
                // Handle division by zero
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle invalid array index
            System.out.println("Invalid array index!");
        }
    }
}