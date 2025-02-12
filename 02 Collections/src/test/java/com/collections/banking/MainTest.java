package com.collections.banking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankingSystemTest {

    @Test
    void testAddAccount() {
        BankingSystem bank = new BankingSystem();
        bank.addAccount("A1", 1000);

        assertEquals(1000, bank.getAccounts().get("A1"), 0.001);
    }

    @Test
    void testProcessWithdrawals() {
        BankingSystem bank = new BankingSystem();
        bank.addAccount("A1", 1000);
        bank.addWithdrawalRequest("A1");
        bank.processWithdrawals();

        assertEquals(900, bank.getAccounts().get("A1"), 0.001);
    }
}