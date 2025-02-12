package com.streams.bytearraystream;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ImageConverterTest {
    @Test
    public void testImageConversion() throws Exception {
        ImageConverter converter = new ImageConverter();
        String inputImage = "C:\\Users\\shriy\\OneDrive\\Pictures\\Documents\\Desktop\\Capgemini Training\\Java Full Stack\\Week 04 Java Collections, Streams\\03 Java Streams\\src\\main\\resources\\Ro-Ko.jpg";
        String outputImage = "testOutput.jpg";

        byte[] imageBytes = converter.imageToByteArray(inputImage);
        converter.byteArrayToImage(imageBytes, outputImage);

        File file = new File(outputImage);
        assertTrue(file.exists());
    }
}
