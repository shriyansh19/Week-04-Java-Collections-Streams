package com.collections.list.nthfromend;

import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class NthFromEndTest {

    @Test
    void testFindNthFromEnd() {
        NthFromEndSolution finder = new NthFromEndSolution();
        List<String> letters = new LinkedList<>(List.of("A", "B", "C", "D", "E"));

        String result = finder.findNthFromEnd(letters, 2);
        assertEquals("D", result);
    }
}