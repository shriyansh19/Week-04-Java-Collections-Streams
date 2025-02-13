package com.collections.policymanagement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Main class to demonstrate policy management operations.
 */
public class PolicyManagementMain {
    public static void main(String[] args) throws ParseException {
        PolicyManager manager = new PolicyManager();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // Adding Sample Policies
        manager.addPolicy(new InsurancePolicy("P1001", "Dwayne Johnson", sdf.parse("2025-12-15"), "Health", 1200.50));
        manager.addPolicy(new InsurancePolicy("P1002", "Will Smith", sdf.parse("2024-02-28"), "Auto", 950.75));
        manager.addPolicy(new InsurancePolicy("P1003", "Rafael Nadal", sdf.parse("2024-03-10"), "Home", 800.00));

        // Display All Policies
        System.out.println("All Policies:");
        for (InsurancePolicy policy : manager.getAllPolicies()) {
            System.out.println(policy);
        }

        // Display Expiring Policies
        System.out.println("\nPolicies Expiring Soon:");
        for (InsurancePolicy policy : manager.getExpiringPolicies()) {
            System.out.println(policy);
        }

        // Display Policies by Coverage Type
        System.out.println("\nAuto Insurance Policies:");
        for (InsurancePolicy policy : manager.getPoliciesByCoverage("Auto")) {
            System.out.println(policy);
        }
    }
}
