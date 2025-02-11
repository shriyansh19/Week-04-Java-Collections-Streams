package com.collections.insurancepolicy;

import java.time.LocalDate;
import java.util.*;

// Class to manage insurance policies using different types of maps
public class PolicyManagement {
    private Map<String, Policy> policyMap = new HashMap<>(); // HashMap for quick lookup
    private Map<String, Policy> linkedPolicyMap = new LinkedHashMap<>(); // LinkedHashMap for insertion order
    private Map<LocalDate, Policy> sortedPolicyMap = new TreeMap<>(); // TreeMap for sorting by expiry date

    // Add a policy
    public void addPolicy(Policy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        linkedPolicyMap.put(policy.getPolicyNumber(), policy);
        sortedPolicyMap.put(policy.getExpiryDate(), policy);
    }

    // Retrieve a policy by its number
    public Policy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    // List all policies expiring within the next 30 days
    public List<Policy> getPoliciesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate expiryThreshold = today.plusDays(30);

        List<Policy> expiringPolicies = new ArrayList<>();
        for (Map.Entry<LocalDate, Policy> entry : sortedPolicyMap.entrySet()) {
            if (entry.getKey().isAfter(today) && entry.getKey().isBefore(expiryThreshold)) {
                expiringPolicies.add(entry.getValue());
            }
        }
        return expiringPolicies;
    }

    // List all policies for a specific policyholder
    public List<Policy> getPoliciesByPolicyholder(String policyholderName) {
        List<Policy> policies = new ArrayList<>();
        for (Policy policy : policyMap.values()) {
            if (policy.getPolicyholderName().equals(policyholderName)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        sortedPolicyMap.entrySet().removeIf(entry -> entry.getKey().isBefore(today));
        policyMap.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
        linkedPolicyMap.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
    }

    // Display all policies in insertion order
    public void displayPoliciesInInsertionOrder() {
        System.out.println("Policies in insertion order:");
        linkedPolicyMap.values().forEach(System.out::println);
    }

    // Display all policies sorted by expiry date
    public void displayPoliciesSortedByExpiry() {
        System.out.println("Policies sorted by expiry date:");
        sortedPolicyMap.values().forEach(System.out::println);
    }
}