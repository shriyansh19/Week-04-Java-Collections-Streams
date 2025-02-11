package com.collections.list.rotateelements;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class RotateTest {

    @Test
    void testRotateList() {
        RotateSolution rotator = new RotateSolution();
        List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 40, 50));

        rotator.rotateList(numbers, 2);
        assertEquals(List.of(40, 50, 10, 20, 30), numbers);
    }
}