package com.collections.banking;

// Main class to demonstrate the banking system
public class Main {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Add accounts
        bank.addAccount("A1", 1000);
        bank.addAccount("A2", 500);
        bank.addAccount("A3", 1500);

        // Add withdrawal requests
        bank.addWithdrawalRequest("A1");
        bank.addWithdrawalRequest("A2");

        // Process withdrawals
        bank.processWithdrawals();

        // Display accounts sorted by balance
        bank.displayAccountsSortedByBalance();
    }
}