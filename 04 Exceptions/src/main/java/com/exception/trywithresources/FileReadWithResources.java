package com.exception.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Demonstrates reading a file using try-with-resources to ensure automatic resource closing.
 */
public class FileReadWithResources {
    /**
     * Reads the first line of a file using BufferedReader.
     * @param fileName The name of the file to read.
     */
    public static void readFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // Read and print the first line of the file
            System.out.println("First line: " + br.readLine());
        } catch (IOException e) {
            // Handle IOException if the file does not exist or cannot be read
            System.out.println("Error reading file");
        }
    }
}