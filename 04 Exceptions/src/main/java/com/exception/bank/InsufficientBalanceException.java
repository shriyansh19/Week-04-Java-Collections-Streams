package com.exception.bank;

/**
 * Custom exception for insufficient balance.
 */
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
