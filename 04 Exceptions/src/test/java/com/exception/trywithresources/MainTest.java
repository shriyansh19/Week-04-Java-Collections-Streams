package com.exception.trywithresources;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Unit tests for FileReadWithResources class.
 */
class FileReadWithResourcesTest {

    @Test
    void testFileExists() throws IOException {
        // Create a temporary file and write content to it
        File tempFile = File.createTempFile("test", ".txt");
        try (FileWriter writer = new FileWriter(tempFile)) {
            writer.write("Hello, World!");
        }
        // Test reading the file
        assertDoesNotThrow(() -> FileReadWithResources.readFile(tempFile.getAbsolutePath()));
        assertTrue(tempFile.delete());
    }

    @Test
    void testFileNotFound() {
        // Test behavior when the file does not exist
        assertDoesNotThrow(() -> FileReadWithResources.readFile("nonexistent.txt"));
    }
}