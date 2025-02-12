package com.streams.filehandling;

import java.io.*;

public class FileReadWrite {
    /**
     * Reads content from a source file and writes it to a destination file.
     * @param sourceFile  The file to read from.
     * @param destFile    The file to write to.
     */
    public void copyFile(String sourceFile, String destFile) {
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading or writing file: " + e.getMessage());
        }
    }
}
