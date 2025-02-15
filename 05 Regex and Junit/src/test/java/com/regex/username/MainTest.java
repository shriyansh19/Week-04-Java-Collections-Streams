package com.regex.username;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsernameValidatorTest {

    @Test
    void testValidUsernames() {
        assertTrue(UsernameValidator.isValidUsername("user_123"));
        assertTrue(UsernameValidator.isValidUsername("abc12345"));
    }

    @Test
    void testInvalidUsernames() {
        assertFalse(UsernameValidator.isValidUsername("123user"));
        assertFalse(UsernameValidator.isValidUsername("us"));
    }
}