package com.streams.bytearraystream;

import java.io.*;

public class ImageConverter {
    /**
     * Converts an image to a byte array.
     * @param inputFile The source image file.
     * @return Byte array representation of the image.
     */
    public byte[] imageToByteArray(String inputFile) throws IOException {
        try (FileInputStream fis = new FileInputStream(inputFile);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            return baos.toByteArray();
        }
    }

    /**
     * Writes a byte array back to an image file.
     * @param byteArray The byte array to write.
     * @param outputFile The destination image file.
     */
    public void byteArrayToImage(byte[] byteArray, String outputFile) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(outputFile)) {
            fos.write(byteArray);
        }
    }
}
