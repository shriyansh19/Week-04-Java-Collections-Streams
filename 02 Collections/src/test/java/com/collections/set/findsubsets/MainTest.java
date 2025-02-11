package com.collections.set.findsubsets;

import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class FindSubsetsTest {

    @Test
    void testIsSubset() {
        FindSubsetsSolution checker = new FindSubsetsSolution();
        Set<Integer> set1 = Set.of(2, 3);
        Set<Integer> set2 = Set.of(1, 2, 3, 4);

        assertTrue(checker.isSubset(set1, set2));
    }
}