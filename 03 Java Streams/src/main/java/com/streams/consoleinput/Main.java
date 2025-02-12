package com.streams.consoleinput;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        String outputFile = "userDetails.txt";

        userInput.saveUserInput(outputFile);
    }
}
