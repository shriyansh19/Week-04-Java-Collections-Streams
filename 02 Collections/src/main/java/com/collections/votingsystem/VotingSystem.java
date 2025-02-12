package com.collections.votingsystem;

import java.util.*;

// Class to manage a voting system
public class VotingSystem {
    private Map<String, Integer> votes = new HashMap<>(); // HashMap to store votes
    private Map<String, Integer> sortedVotes = new TreeMap<>(); // TreeMap to display results in sorted order
    private Map<String, Integer> linkedVotes = new LinkedHashMap<>(); // LinkedHashMap to maintain insertion order

    // Add a vote for a candidate
    public void addVote(String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        sortedVotes.put(candidate, votes.get(candidate));
        linkedVotes.put(candidate, votes.get(candidate));
    }

    // Display results in sorted order
    public void displaySortedResults() {
        System.out.println("Voting Results (Sorted by Candidate):");
        sortedVotes.forEach((candidate, count) -> System.out.println(candidate + ": " + count));
    }

    // Display results in insertion order
    public void displayInsertionOrderResults() {
        System.out.println("Voting Results (Insertion Order):");
        linkedVotes.forEach((candidate, count) -> System.out.println(candidate + ": " + count));
    }


}