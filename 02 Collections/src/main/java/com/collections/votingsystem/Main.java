package com.collections.votingsystem;

// Main class to demonstrate the voting system
public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Add votes
        votingSystem.addVote("Alice");
        votingSystem.addVote("Bob");
        votingSystem.addVote("Alice");

        // Display results
        votingSystem.displaySortedResults();
        votingSystem.displayInsertionOrderResults();
    }
}