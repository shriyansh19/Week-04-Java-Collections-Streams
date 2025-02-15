package com.regex.licenseplate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LicensePlateValidatorTest {

    @Test
    void testValidPlates() {
        assertTrue(LicensePlateValidator.isValidLicensePlate("AB1234"));
    }

    @Test
    void testInvalidPlates() {
        assertFalse(LicensePlateValidator.isValidLicensePlate("A12345"));
    }
}