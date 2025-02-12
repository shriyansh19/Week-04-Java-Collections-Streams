package com.streams.bufferedstreams;

import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BufferedFileCopyTest {
    @Test
    public void testBufferedFileCopy() throws IOException {
        BufferedFileCopy fileCopier = new BufferedFileCopy();
        String source = "testLargeFile.txt";
        String destination = "testBufferedCopy.txt";

        // Create a test file
        try (FileWriter writer = new FileWriter(source)) {
            writer.write("This is a test file for buffered copy.");
        }

        fileCopier.copyFileWithBuffer(source, destination);

        // Check if file exists and is not empty
        File destFile = new File(destination);
        assertTrue(destFile.exists() && destFile.length() > 0);
    }
}
