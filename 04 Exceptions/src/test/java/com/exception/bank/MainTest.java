package com.exception.bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for BankAccount class.
 */
class BankAccountTest {

    @Test
    void testValidWithdrawal() {
        BankAccount account = new BankAccount(1000);
        assertDoesNotThrow(() -> account.withdraw(500));
    }

    @Test
    void testInsufficientBalance() {
        BankAccount account = new BankAccount(1000);
        assertThrows(InsufficientBalanceException.class, () -> account.withdraw(1500));
    }

    @Test
    void testInvalidAmount() {
        BankAccount account = new BankAccount(1000);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-100));
    }
}