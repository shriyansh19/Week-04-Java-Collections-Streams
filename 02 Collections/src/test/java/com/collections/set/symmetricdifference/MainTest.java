package com.collections.set.symmetricdifference;

import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class SymmetricDifferenceTest {

    @Test
    void testSymmetricDifference() {
        SymmetricDifferenceSolution solver = new SymmetricDifferenceSolution();
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 4, 5);

        Set<Integer> symmetricDiff = solver.symmetricDifference(set1, set2);
        assertEquals(Set.of(1, 2, 4, 5), symmetricDiff);
    }
}