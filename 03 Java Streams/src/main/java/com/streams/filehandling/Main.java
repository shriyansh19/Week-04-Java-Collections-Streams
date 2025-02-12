package com.streams.filehandling;

public class Main {
    public static void main(String[] args) {
        FileReadWrite fileHandler = new FileReadWrite();
        String source = "C:\\Users\\shriy\\OneDrive\\Pictures\\Documents\\Desktop\\Capgemini Training\\Java Full Stack\\Week 04 Java Collections, Streams\\03 Java Streams\\src\\main\\resources\\Roger Federer.txt";
        String destination = "C:\\Users\\shriy\\OneDrive\\Pictures\\Documents\\Desktop\\Capgemini Training\\Java Full Stack\\Week 04 Java Collections, Streams\\03 Java Streams\\src\\main\\resources\\Roger Federer Output.txt";

        fileHandler.copyFile(source, destination);
    }
}
