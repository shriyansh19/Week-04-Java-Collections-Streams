package com.streams.wordcounter;

public class Main {
    public static void main(String[] args) {
        WordCounter counter = new WordCounter();
        String filename = "C:\\Users\\shriy\\OneDrive\\Pictures\\Documents\\Desktop\\Capgemini Training\\Java Full Stack\\Week 04 Java Collections, Streams\\03 Java Streams\\src\\main\\resources\\Rafael Nadal.txt"; // Replace with actual file path

        counter.countWords(filename);
    }
}
