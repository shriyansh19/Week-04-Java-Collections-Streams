package com.exception.throwvsthrows;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for InterestCalculator class.
 */
class InterestCalculatorTest {

    @Test
    void testValidInput() {
        // Test valid input
        assertDoesNotThrow(() -> InterestCalculator.calculateInterest(1000, 5, 2));
    }

    @Test
    void testInvalidInput() {
        // Test invalid input (negative amount)
        assertThrows(IllegalArgumentException.class, () -> InterestCalculator.calculateInterest(-1000, 5, 2));
    }
}