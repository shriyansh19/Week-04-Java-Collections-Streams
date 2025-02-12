package com.streams.largefilereader;

public class Main {
    public static void main(String[] args) {
        LargeFileReader fileReader = new LargeFileReader();
        String filename = "C:\\Users\\shriy\\OneDrive\\Pictures\\Documents\\Desktop\\Capgemini Training\\Java Full Stack\\Week 04 Java Collections, Streams\\03 Java Streams\\src\\main\\resources\\Roger Federer.txt";

        fileReader.readFile(filename);
    }
}
