package com.exception.nested;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for NestedTryCatch class.
 */
class NestedTryCatchTest {

    @Test
    void testValidOperation() {
        int[] array = {10, 20, 30};
        // Test valid operation
        assertDoesNotThrow(() -> NestedTryCatch.performOperation(array, 1, 2));
    }

    @Test
    void testInvalidIndex() {
        int[] array = {10, 20, 30};
        // Test invalid index
        assertDoesNotThrow(() -> NestedTryCatch.performOperation(array, 5, 2));
    }

    @Test
    void testDivisionByZero() {
        int[] array = {10, 20, 30};
        // Test division by zero
        assertDoesNotThrow(() -> NestedTryCatch.performOperation(array, 1, 0));
    }
}