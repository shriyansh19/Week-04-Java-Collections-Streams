package com.streams.serialization;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeSerializerTest {
    @Test
    public void testSerialization() {
        EmployeeSerializer serializer = new EmployeeSerializer();
        String filename = "testEmployees.ser";

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 50000),
                new Employee(2, "Bob", "IT", 70000)
        );

        serializer.serializeEmployees(employees, filename);
        File file = new File(filename);
        assertTrue(file.exists());

        List<Employee> deserializedEmployees = serializer.deserializeEmployees(filename);
        assertNotNull(deserializedEmployees);
        assertEquals(2, deserializedEmployees.size());
        assertEquals("Alice", deserializedEmployees.get(0).getName());
    }
}
