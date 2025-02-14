package com.exception.finallyblock;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for DivisionWithFinally class.
 */
class DivisionWithFinallyTest {

    @Test
    void testValidDivision() {
        // Simulate valid input
        assertDoesNotThrow(() -> DivisionWithFinally.performDivision());
    }

    @Test
    void testDivisionByZero() {
        // Simulate division by zero
        assertThrows(ArithmeticException.class, () -> DivisionWithFinally.performDivision());
    }
}