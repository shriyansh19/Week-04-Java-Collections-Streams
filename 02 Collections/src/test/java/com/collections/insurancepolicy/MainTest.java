package com.collections.insurancepolicy;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PolicyManagementTest {

    @Test
    void testAddAndRetrievePolicy() {
        PolicyManagement manager = new PolicyManagement();
        Policy policy = new Policy("P1", "Alice", LocalDate.of(2023, 12, 31));
        manager.addPolicy(policy);

        assertEquals(policy, manager.getPolicyByNumber("P1"));
    }

    @Test
    void testGetPoliciesExpiringSoon() {
        PolicyManagement manager = new PolicyManagement();
        manager.addPolicy(new Policy("P1", "Alice", LocalDate.now().plusDays(10)));
        manager.addPolicy(new Policy("P2", "Bob", LocalDate.now().plusDays(40)));

        List<Policy> expiringPolicies = manager.getPoliciesExpiringSoon();
        assertEquals(1, expiringPolicies.size());
    }

    @Test
    void testRemoveExpiredPolicies() {
        PolicyManagement manager = new PolicyManagement();
        manager.addPolicy(new Policy("P1", "Alice", LocalDate.now().minusDays(1)));
        manager.addPolicy(new Policy("P2", "Bob", LocalDate.now().plusDays(10)));

        manager.removeExpiredPolicies();
        assertNull(manager.getPolicyByNumber("P1"));
        assertNotNull(manager.getPolicyByNumber("P2"));
    }
}