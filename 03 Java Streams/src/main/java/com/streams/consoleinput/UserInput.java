package com.streams.consoleinput;

import java.io.*;

public class UserInput {
    /**
     * Reads user input from the console and writes it to a file.
     * @param outputFile The file where user input will be saved.
     */
    public void saveUserInput(String outputFile) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(outputFile)) {

            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Write to file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");

            System.out.println("User details saved successfully!");

        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age format. Please enter a number.");
        }
    }
}
