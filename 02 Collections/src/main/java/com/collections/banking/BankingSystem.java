package com.collections.banking;

import java.util.*;

// Class to manage a banking system
public class BankingSystem {
    private Map<String, Double> accounts = new HashMap<>(); // HashMap for account balances
    private Map<Double, String> sortedAccounts = new TreeMap<>(); // TreeMap for sorting by balance
    private Queue<String> withdrawalQueue = new LinkedList<>(); // Queue for withdrawal requests

    // Add an account
    public void addAccount(String accountNumber, double balance) {
        accounts.put(accountNumber, balance);
        sortedAccounts.put(balance, accountNumber);
    }

    // Process withdrawal requests
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            String accountNumber = withdrawalQueue.poll();
            double balance = accounts.getOrDefault(accountNumber, 0.0);
            if (balance > 0) {
                accounts.put(accountNumber, balance - 100); // Withdraw $100
                sortedAccounts.remove(balance);
                sortedAccounts.put(balance - 100, accountNumber);
            }
        }
    }

    // Add a withdrawal request
    public void addWithdrawalRequest(String accountNumber) {
        withdrawalQueue.add(accountNumber);
    }

    // Display accounts sorted by balance
    public void displayAccountsSortedByBalance() {
        System.out.println("Accounts sorted by balance:");
        sortedAccounts.forEach((balance, accountNumber) -> System.out.println(accountNumber + ": $" + balance));
    }
}