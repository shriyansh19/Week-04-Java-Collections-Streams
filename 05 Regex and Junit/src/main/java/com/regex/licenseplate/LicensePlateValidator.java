package com.regex.licenseplate;

import java.util.regex.Pattern;

/**
 * Validates a license plate number.
 */
public class LicensePlateValidator {
    private static final String LICENSE_PLATE_REGEX = "^[A-Z]{2}\\d{4}$";

    /**
     * Checks if the given license plate is valid.
     * @param licensePlate The license plate to validate.
     * @return True if valid, false otherwise.
     */
    public static boolean isValidLicensePlate(String licensePlate) {
        return Pattern.matches(LICENSE_PLATE_REGEX, licensePlate);
    }
}