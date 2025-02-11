package com.collections.list.removeduplicates;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicates() {
        RemoveDuplicatesSolution remover = new RemoveDuplicatesSolution();
        List<Integer> numbers = List.of(3, 1, 2, 2, 3, 4);

        List<Integer> uniqueList = remover.removeDuplicates(numbers);
        assertEquals(List.of(3, 1, 2, 4), uniqueList);
    }
}