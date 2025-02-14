package com.exception.throwvsthrows;

/**
 * Demonstrates exception propagation using 'throw' and 'throws'.
 */
public class InterestCalculator {
    /**
     * Calculates simple interest.
     * @param amount The principal amount.
     * @param rate The interest rate.
     * @param years The number of years.
     * @return The calculated interest.
     * @throws IllegalArgumentException If amount or rate is negative.
     */
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        return amount * rate * years / 100;
    }
}