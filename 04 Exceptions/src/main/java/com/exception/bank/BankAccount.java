package com.exception.bank;

/**
 * Bank account system with withdrawal functionality.
 */
public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    /**
     * Withdraws money from the account.
     * @param amount The amount to withdraw.
     * @throws InsufficientBalanceException If withdrawal exceeds balance.
     * @throws IllegalArgumentException If the amount is negative.
     */
    public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}