package com.streams.pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedCommunication {
    /**
     * Writes data to the piped output stream.
     */
    static class WriterThread extends Thread {
        private PipedOutputStream outputStream;

        public WriterThread(PipedOutputStream outputStream) {
            this.outputStream = outputStream;
        }

        public void run() {
            try {
                String message = "Hello from WriterThread!";
                outputStream.write(message.getBytes());
                outputStream.close();
            } catch (IOException e) {
                System.out.println("Writer error: " + e.getMessage());
            }
        }
    }

    /**
     * Reads data from the piped input stream.
     */
    static class ReaderThread extends Thread {
        private PipedInputStream inputStream;

        public ReaderThread(PipedInputStream inputStream) {
            this.inputStream = inputStream;
        }

        public void run() {
            try {
                int data;
                while ((data = inputStream.read()) != -1) {
                    System.out.print((char) data);
                }
                inputStream.close();
            } catch (IOException e) {
                System.out.println("Reader error: " + e.getMessage());
            }
        }
    }
}
