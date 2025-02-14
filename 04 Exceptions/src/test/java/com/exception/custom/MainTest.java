package com.exception.custom;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AgeValidatorTest {

    @Test
    void testValidAge() {
        assertDoesNotThrow(() -> AgeValidator.validateAge(20));
    }

    @Test
    void testInvalidAge() {
        assertThrows(InvalidAgeException.class, () -> AgeValidator.validateAge(15));
    }
}