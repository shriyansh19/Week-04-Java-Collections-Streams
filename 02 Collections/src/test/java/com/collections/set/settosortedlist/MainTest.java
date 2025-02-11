package com.collections.set.settosortedlist;

import org.junit.jupiter.api.Test;
import java.util.Set;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SetToSortedListTest {

    @Test
    void testConvertToSortedList() {
        SetToSortedListSolution converter = new SetToSortedListSolution();
        Set<Integer> numbers = Set.of(5, 3, 9, 1);

        List<Integer> sortedList = converter.convertToSortedList(numbers);
        assertEquals(List.of(1, 3, 5, 9), sortedList);
    }
}