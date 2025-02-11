package com.collections.queue.hospitaltriage;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class HospitalTriageTest {

    @Test
    void testTriagePatients() {
        HospitalTriageSolution triageSystem = new HospitalTriageSolution();
        List<HospitalTriageSolution.Patient> patients = List.of(
                new HospitalTriageSolution.Patient("John", 3),
                new HospitalTriageSolution.Patient("Alice", 5),
                new HospitalTriageSolution.Patient("Bob", 2)
        );

        List<String> triageOrder = triageSystem.triagePatients(patients);
        assertEquals(List.of("Alice", "John", "Bob"), triageOrder);
    }
}