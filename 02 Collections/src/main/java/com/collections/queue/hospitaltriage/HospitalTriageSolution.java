package com.collections.queue.hospitaltriage;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

// Class to simulate a hospital triage system using a priority queue
public class HospitalTriageSolution {

    // Represents a patient with a name and severity level
    static class Patient implements Comparable<Patient> {
        String name;
        int severity;

        public Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }

        @Override
        public int compareTo(Patient other) {
            // Higher severity patients come first
            return Integer.compare(other.severity, this.severity);
        }

        @Override
        public String toString() {
            return name + " (Severity: " + severity + ")";
        }
    }

    // Simulates the triage system
    public List<String> triagePatients(List<Patient> patients) {
        PriorityQueue<Patient> queue = new PriorityQueue<>(patients);
        List<String> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            result.add(queue.poll().name);
        }

        return result;
    }
}