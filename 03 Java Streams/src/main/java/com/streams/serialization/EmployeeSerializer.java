package com.streams.serialization;

import java.io.*;
import java.util.List;

public class EmployeeSerializer {
    /**
     * Serializes a list of employees to a file.
     * @param employees List of employees to serialize.
     * @param filename The file where employees are saved.
     */
    public void serializeEmployees(List<Employee> employees, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(employees);
            System.out.println("Employees saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving employees: " + e.getMessage());
        }
    }

    /**
     * Deserializes employees from a file.
     * @param filename The file to read employees from.
     * @return List of employees.
     */
    public List<Employee> deserializeEmployees(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading employees: " + e.getMessage());
            return null;
        }
    }
}
