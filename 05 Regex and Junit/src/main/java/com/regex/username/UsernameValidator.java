package com.regex.username;

import java.util.regex.Pattern;

/**
 * Validates a username based on specific rules.
 */
public class UsernameValidator {
    private static final String USERNAME_REGEX = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

    /**
     * Checks if the given username is valid.
     * @param username The username to validate.
     * @return True if valid, false otherwise.
     */
    public static boolean isValidUsername(String username) {
        return Pattern.matches(USERNAME_REGEX, username);
    }
}