package com.collections.queue.generatebinarynumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

// Class to generate binary numbers using a queue
public class GenerateBinaryNumbersSolution {

    // Generates the first N binary numbers as strings
    public List<String> generateBinaryNumbers(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1"); // Start with "1"

        for (int i = 0; i < n; i++) {
            String current = queue.poll();
            result.add(current);

            // Append "0" and "1" to the current binary number
            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }
}