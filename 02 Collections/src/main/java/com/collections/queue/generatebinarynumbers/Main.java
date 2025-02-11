package com.collections.queue.generatebinarynumbers;

import java.util.List;

// Main class to demonstrate generating binary numbers
public class Main {
    public static void main(String[] args) {
        int n = 5;

        GenerateBinaryNumbersSolution generator = new GenerateBinaryNumbersSolution();
        List<String> binaryNumbers = generator.generateBinaryNumbers(n);

        System.out.println("First " + n + " binary numbers: " + binaryNumbers);
    }
}