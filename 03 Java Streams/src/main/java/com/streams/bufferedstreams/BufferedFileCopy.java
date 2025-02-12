package com.streams.bufferedstreams;

import java.io.*;

public class BufferedFileCopy {
    /**
     * Copies a file using buffered streams and measures execution time.
     * @param sourceFile The file to be copied.
     * @param destFile The destination file.
     */
    public void copyFileWithBuffer(String sourceFile, String destFile) {
        long startTime = System.nanoTime();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile))) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            long endTime = System.nanoTime();
            System.out.println("File copied in: " + (endTime - startTime) / 1_000_000 + " ms");

        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
