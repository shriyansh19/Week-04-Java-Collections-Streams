package com.streams.bytearraystream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ImageConverter converter = new ImageConverter();
        String inputImage = "C:\\Users\\shriy\\OneDrive\\Pictures\\Documents\\Desktop\\Capgemini Training\\Java Full Stack\\Week 04 Java Collections, Streams\\03 Java Streams\\src\\main\\resources\\Ro-Ko.jpg";
        String outputImage = "C:\\Users\\shriy\\OneDrive\\Pictures\\Documents\\Desktop\\Capgemini Training\\Java Full Stack\\Week 04 Java Collections, Streams\\03 Java Streams\\src\\main\\resources\\Ro-Ko Output.jpg";

        try {
            // Convert image to byte array
            byte[] imageBytes = converter.imageToByteArray(inputImage);

            // Convert byte array back to image
            converter.byteArrayToImage(imageBytes, outputImage);

            System.out.println("Image conversion successful!");

        } catch (IOException e) {
            System.out.println("Error processing image: " + e.getMessage());
        }
    }
}
