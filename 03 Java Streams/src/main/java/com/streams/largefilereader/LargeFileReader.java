package com.streams.largefilereader;

import java.io.*;

public class LargeFileReader {
    /**
     * Reads a large file line by line and prints lines containing "error" (case insensitive).
     * @param filename The large file to read.
     */
    public void readFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
