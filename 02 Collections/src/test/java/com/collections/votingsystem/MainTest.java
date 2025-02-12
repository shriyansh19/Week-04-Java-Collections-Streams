package com.collections.votingsystem;

import com.collections.votingsystem.VotingSystem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VotingSystemTest {

    @Test
    void testAddVote() {
        VotingSystem votingSystem = new VotingSystem();
        votingSystem.addVote("Alice");
        votingSystem.addVote("Bob");

        assertEquals(1, votingSystem.get("Bob"));
    }
}