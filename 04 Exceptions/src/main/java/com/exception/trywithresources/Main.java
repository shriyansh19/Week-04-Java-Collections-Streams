package com.exception.trywithresources;

/**
 * Main class to demonstrate try-with-resources for file reading.
 */
public class Main {
    public static void main(String[] args) {
        // Call the method to read the file
        FileReadWithResources.readFile("info.txt");
    }
}