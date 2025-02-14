package com.exception.checked;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class FileReadExampleTest {

    @Test
    void testFileExists() throws IOException {
        File tempFile = File.createTempFile("test", ".txt");
        try (FileWriter writer = new FileWriter(tempFile)) {
            writer.write("Hello, World!");
        }
        FileReadExample.readFile(tempFile.getAbsolutePath());
        assertTrue(tempFile.delete());
    }

    @Test
    void testFileNotFound() {
        assertDoesNotThrow(() -> FileReadExample.readFile("nonexistent.txt"));
    }
}