package com.streams.filehandling;

import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileReadWriteTest {
    @Test
    public void testFileCopy() throws IOException {
        FileReadWrite fileHandler = new FileReadWrite();
        String source = "testInput.txt";
        String destination = "testOutput.txt";

        // Create a test input file
        try (FileWriter writer = new FileWriter(source)) {
            writer.write("Hello, this is a test file.");
        }

        fileHandler.copyFile(source, destination);

        // Check if destination file exists and is not empty
        File destFile = new File(destination);
        assertTrue(destFile.exists() && destFile.length() > 0);
    }
}
