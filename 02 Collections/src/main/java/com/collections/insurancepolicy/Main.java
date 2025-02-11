package com.collections.insurancepolicy;

import java.time.LocalDate;

// Main class to demonstrate the insurance policy management system
public class Main {
    public static void main(String[] args) {
        PolicyManagement manager = new PolicyManagement();

        // Add policies
        manager.addPolicy(new Policy("P1", "Alice", LocalDate.of(2023, 12, 31)));
        manager.addPolicy(new Policy("P2", "Bob", LocalDate.of(2023, 10, 15)));
        manager.addPolicy(new Policy("P3", "Alice", LocalDate.of(2024, 1, 10)));

        // Retrieve a policy
        System.out.println("Policy P1: " + manager.getPolicyByNumber("P1"));

        // List policies expiring within 30 days
        System.out.println("Policies expiring soon: " + manager.getPoliciesExpiringSoon());

        // List policies for a specific policyholder
        System.out.println("Policies for Alice: " + manager.getPoliciesByPolicyholder("Alice"));

        // Remove expired policies
        manager.removeExpiredPolicies();

        // Display policies in insertion order
        manager.displayPoliciesInInsertionOrder();

        // Display policies sorted by expiry date
        manager.displayPoliciesSortedByExpiry();
    }
}