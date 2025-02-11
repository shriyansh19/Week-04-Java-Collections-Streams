package com.collections.set.checkequals;

import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class CheckEqualsTest {

    @Test
    void testAreSetsEqual() {
        CheckEqualsSolution checker = new CheckEqualsSolution();
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 2, 1);

        assertTrue(checker.areSetsEqual(set1, set2));
    }
}