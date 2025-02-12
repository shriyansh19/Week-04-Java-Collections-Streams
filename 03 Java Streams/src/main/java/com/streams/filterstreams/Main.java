package com.streams.filterstreams;

public class Main {
    public static void main(String[] args) {
        UpperToLowerConverter converter = new UpperToLowerConverter();
        String inputFile = "C:\\Users\\shriy\\OneDrive\\Pictures\\Documents\\Desktop\\Capgemini Training\\Java Full Stack\\Week 04 Java Collections, Streams\\03 Java Streams\\src\\main\\resources\\Rafael Nadal Copy.txt";
        String outputFile = "C:\\Users\\shriy\\OneDrive\\Pictures\\Documents\\Desktop\\Capgemini Training\\Java Full Stack\\Week 04 Java Collections, Streams\\03 Java Streams\\src\\main\\resources\\Rafael Nadal Copy lowercase.txt";

        converter.convertToLowercase(inputFile, outputFile);
    }
}
