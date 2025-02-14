package com.exception.finallyblock;

import java.util.Scanner;

/**
 * Demonstrates the use of the finally block in exception handling.
 */
public class DivisionWithFinally {
    /**
     * Performs integer division and ensures the finally block executes.
     */
    public static void performDivision() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();
            System.out.println("Result: " + (numerator / denominator));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Operation completed");
            scanner.close();
        }
    }
}