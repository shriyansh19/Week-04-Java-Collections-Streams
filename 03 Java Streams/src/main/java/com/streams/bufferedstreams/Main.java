package com.streams.bufferedstreams;

public class Main {
    public static void main(String[] args) {
        BufferedFileCopy fileCopier = new BufferedFileCopy();
        String source = "C:\\Users\\shriy\\OneDrive\\Pictures\\Documents\\Desktop\\Capgemini Training\\Java Full Stack\\Week 04 Java Collections, Streams\\03 Java Streams\\src\\main\\resources\\Rafael Nadal.txt";
        String destination = "C:\\Users\\shriy\\OneDrive\\Pictures\\Documents\\Desktop\\Capgemini Training\\Java Full Stack\\Week 04 Java Collections, Streams\\03 Java Streams\\src\\main\\resources\\Rafael Nadal copiedFile.txt";

        fileCopier.copyFileWithBuffer(source, destination);
    }
}
