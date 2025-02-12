package com.streams.serialization;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeSerializer serializer = new EmployeeSerializer();
        String filename = "employees.ser";

        // Create a list of employees
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alexa", "HR", 50000),
                new Employee(2, "Bobby", "IT", 70000),
                new Employee(3, "Charlie", "Finance", 60000)
        );

        // Serialize employees
        serializer.serializeEmployees(employees, filename);

        // Deserialize and display employees
        List<Employee> loadedEmployees = serializer.deserializeEmployees(filename);
        if (loadedEmployees != null) {
            loadedEmployees.forEach(System.out::println);
        }
    }
}
