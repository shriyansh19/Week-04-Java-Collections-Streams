package com.streams.pipedstreams;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            PipedOutputStream outputStream = new PipedOutputStream();
            PipedInputStream inputStream = new PipedInputStream(outputStream);

            PipedCommunication.WriterThread writer = new PipedCommunication.WriterThread(outputStream);
            PipedCommunication.ReaderThread reader = new PipedCommunication.ReaderThread(inputStream);

            writer.start();
            reader.start();

            writer.join();
            reader.join();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
