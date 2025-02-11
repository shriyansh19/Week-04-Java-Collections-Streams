package com.collections.queue.generatebinarynumbers;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class GenerateBinaryNumbersTest {

    @Test
    void testGenerateBinaryNumbers() {
        GenerateBinaryNumbersSolution generator = new GenerateBinaryNumbersSolution();
        List<String> binaryNumbers = generator.generateBinaryNumbers(5);

        assertEquals(List.of("1", "10", "11", "100", "101"), binaryNumbers);
    }
}