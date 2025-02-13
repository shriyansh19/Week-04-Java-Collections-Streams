package com.collections.policymanagement;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Set;

/**
 * Unit test class for PolicyManager functionalities.
 */
class PolicyManagerTest {

    @Test
    void testPolicyAdditionAndRetrieval() throws ParseException {
        PolicyManager manager = new PolicyManager();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        InsurancePolicy policy = new InsurancePolicy("P2001", "John Cena", sdf.parse("2024-12-01"), "Health", 1000.00);
        manager.addPolicy(policy);

        Set<InsurancePolicy> policies = manager.getAllPolicies();
        assertTrue(policies.contains(policy));
    }

    @Test
    void testExpiringPolicies() throws ParseException {
        PolicyManager manager = new PolicyManager();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        InsurancePolicy expiringPolicy = new InsurancePolicy("P3001", "Jane Cena", sdf.parse("2024-02-15"), "Auto", 1200.00);
        manager.addPolicy(expiringPolicy);

        Set<InsurancePolicy> expiringPolicies = manager.getExpiringPolicies();
        assertTrue(expiringPolicies.contains(expiringPolicy));
    }
}
