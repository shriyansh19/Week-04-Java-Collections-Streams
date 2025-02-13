package com.collections.policymanagement;

import java.util.*;

/**
 * Manages insurance policies using HashSet, LinkedHashSet, and TreeSet for different functionalities.
 */
public class PolicyManager {
    private Set<InsurancePolicy> hashSetPolicies;        // Stores policies for quick lookup
    private Set<InsurancePolicy> linkedHashSetPolicies;  // Maintains insertion order
    private Set<InsurancePolicy> treeSetPolicies;        // Stores policies sorted by expiry date

    /**
     * Initializes the sets for storing policies.
     */
    public PolicyManager() {
        hashSetPolicies = new HashSet<>();
        linkedHashSetPolicies = new LinkedHashSet<>();
        treeSetPolicies = new TreeSet<>();
    }

    /**
     * Adds a policy to all sets (HashSet, LinkedHashSet, and TreeSet).
     */
    public void addPolicy(InsurancePolicy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    /**
     * Retrieves all unique policies.
     */
    public Set<InsurancePolicy> getAllPolicies() {
        return hashSetPolicies; // HashSet ensures uniqueness
    }

    /**
     * Retrieves policies expiring within the next 30 days.
     */
    public Set<InsurancePolicy> getExpiringPolicies() {
        Set<InsurancePolicy> expiringSoon = new HashSet<>();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date thresholdDate = calendar.getTime();

        for (InsurancePolicy policy : treeSetPolicies) {
            if (policy.getExpiryDate().before(thresholdDate)) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }

    /**
     * Retrieves policies based on a specific coverage type (e.g., Health, Auto).
     */
    public Set<InsurancePolicy> getPoliciesByCoverage(String coverageType) {
        Set<InsurancePolicy> result = new HashSet<>();
        for (InsurancePolicy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                result.add(policy);
            }
        }
        return result;
    }
}
