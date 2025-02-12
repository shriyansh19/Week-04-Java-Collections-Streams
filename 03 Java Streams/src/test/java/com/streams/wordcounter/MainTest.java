package com.streams.wordcounter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

class WordCounterTest {

    @Test
    void testCountWords() throws IOException {
        String testFile = "test_word_count.txt";

        // Creating a test file with sample words
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(testFile))) {
            writer.write("apple banana apple\n");
            writer.write("banana apple orange\n");
            writer.write("orange banana apple orange\n");
        }

        WordCounter counter = new WordCounter();

        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(testOutput)); // Redirect output

        counter.countWords(testFile);

        System.setOut(originalOut); // Restore original output

        String output = testOutput.toString().toLowerCase();
        assertTrue(output.contains("apple: 4"));
        assertTrue(output.contains("banana: 3"));
        assertTrue(output.contains("orange: 3"));

        new File(testFile).delete(); // Clean up test file
    }
}
