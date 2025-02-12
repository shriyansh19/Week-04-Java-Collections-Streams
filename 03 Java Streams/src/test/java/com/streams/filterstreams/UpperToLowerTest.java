package com.streams.filterstreams;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UpperToLowerTest {
    @Test
    public void testConvertToLowercase() {
        UpperToLowerConverter converter = new UpperToLowerConverter();
        String inputFile = "C:\\Users\\shriy\\OneDrive\\Pictures\\Documents\\Desktop\\Capgemini Training\\Java Full Stack\\Week 04 Java Collections, Streams\\03 Java Streams\\src\\main\\resources\\Rafael Nadal Copy.txt";
        String outputFile = "testLower.txt";

        converter.convertToLowercase(inputFile, outputFile);

        File file = new File(outputFile);
        assertTrue(file.exists());
    }
}
