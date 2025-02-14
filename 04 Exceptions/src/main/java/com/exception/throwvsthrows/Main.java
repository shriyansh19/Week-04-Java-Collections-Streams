package com.exception.throwvsthrows;

import java.util.Scanner;

/**
 * Main class to demonstrate exception propagation.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();
            System.out.print("Enter rate: ");
            double rate = scanner.nextDouble();
            System.out.print("Enter years: ");
            int years = scanner.nextInt();
            // Call the method and handle exceptions
            double interest = InterestCalculator.calculateInterest(amount, rate, years);
            System.out.println("Calculated interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}