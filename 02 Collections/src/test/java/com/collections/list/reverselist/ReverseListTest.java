package com.collections.list.reverselist;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ReverseListTest {

    @Test
    void testReverseList() {
        ReverseListSolution reverser = new ReverseListSolution();
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        reverser.reverseList(numbers);
        assertEquals(List.of(5, 4, 3, 2, 1), numbers);
    }
}