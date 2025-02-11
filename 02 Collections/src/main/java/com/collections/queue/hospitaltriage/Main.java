package com.collections.queue.hospitaltriage;

import java.util.List;

// Main class to demonstrate the hospital triage system
public class Main {
    public static void main(String[] args) {
        List<HospitalTriageSolution.Patient> patients = List.of(
                new HospitalTriageSolution.Patient("John", 3),
                new HospitalTriageSolution.Patient("Alice", 5),
                new HospitalTriageSolution.Patient("Bob", 2)
        );

        HospitalTriageSolution triageSystem = new HospitalTriageSolution();
        List<String> triageOrder = triageSystem.triagePatients(patients);

        System.out.println("Triage Order: " + triageOrder);
    }
}