package com.exception.multiplecatchblocks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {

    @Test
    void testValidIndex() {
        Integer[] array = {1, 2, 3};
        assertDoesNotThrow(() -> ArrayOperations.printValueAtIndex(array, 1));
    }

    @Test
    void testInvalidIndex() {
        Integer[] array = {1, 2, 3};
        assertDoesNotThrow(() -> ArrayOperations.printValueAtIndex(array, 5));
    }
}