package com.exception.unchecked;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivisionExampleTest {

    @Test
    void testValidDivision() {
        // Simulate valid input using System.setIn
        assertDoesNotThrow(() -> DivisionExample.divideNumbers());
    }

    @Test
    void testDivisionByZero() {
        // Simulate division by zero
        assertThrows(ArithmeticException.class, () -> {
            DivisionExample.divideNumbers();
        });
    }
}