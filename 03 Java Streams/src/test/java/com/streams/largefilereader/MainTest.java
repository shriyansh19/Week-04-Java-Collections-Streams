package com.streams.largefilereader;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

class LargeFileReaderTest {

    @Test
    void testReadFile() throws IOException {
        String testFile = "test_large_file.txt";

        // Creating a test file with sample data
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(testFile))) {
            writer.write("This is a test file.\n");
            writer.write("Error: Something went wrong.\n");
            writer.write("Another line without error.\n");
        }

        LargeFileReader reader = new LargeFileReader();

        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(testOutput)); // Redirect output

        reader.readFile(testFile);

        System.setOut(originalOut); // Restore original output

        String output = testOutput.toString().toLowerCase();
        assertTrue(output.contains("error: something went wrong"));

        new File(testFile).delete(); // Clean up test file
    }
}
