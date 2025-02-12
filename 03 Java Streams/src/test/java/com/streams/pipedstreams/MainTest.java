package com.streams.pipedstreams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

class PipedCommunicationTest {

    @Test
    void testPipedCommunication() throws IOException {
        PipedOutputStream outputStream = new PipedOutputStream();
        PipedInputStream inputStream = new PipedInputStream(outputStream);

        PipedCommunication.WriterThread writer = new PipedCommunication.WriterThread(outputStream);
        PipedCommunication.ReaderThread reader = new PipedCommunication.ReaderThread(inputStream);

        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(testOutput)); // Redirect output to test it

        writer.start();
        reader.start();

        try {
            writer.join();
            reader.join();
        } catch (InterruptedException e) {
            fail("Threads were interrupted");
        }

        System.setOut(originalOut); // Restore original output

        assertTrue(testOutput.toString().contains("Hello from WriterThread!"));
    }
}
