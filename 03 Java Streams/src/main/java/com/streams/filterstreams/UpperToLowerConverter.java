package com.streams.filterstreams;

import java.io.*;

public class UpperToLowerConverter {
    /**
     * Reads a text file and writes its contents to another file, converting uppercase letters to lowercase.
     * @param inputFile The source file.
     * @param outputFile The destination file.
     */
    public void convertToLowercase(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase() + "\n");
            }

            System.out.println("File conversion successful!");

        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}
