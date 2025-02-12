package com.streams.consoleinput;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserInputTest {
    @Test
    public void testSaveUserInput() throws IOException {
        UserInput userInput = new UserInput();
        String outputFile = "testUserDetails.txt";

        // Simulate user input using ByteArrayInputStream
        String simulatedInput = "Brock Lesnar\n25\nC++\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        userInput.saveUserInput(outputFile);

        // Check if file exists and is not empty
        File file = new File(outputFile);
        assertTrue(file.exists() && file.length() > 0);
    }
}
