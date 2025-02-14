package com.exception.propagation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for ExceptionPropagation class.
 */
class ExceptionPropagationTest {

    @Test
    void testExceptionPropagation() {
        // Test exception propagation from method1 -> method2 -> main
        assertThrows(ArithmeticException.class, () -> ExceptionPropagation.method2());
    }
}