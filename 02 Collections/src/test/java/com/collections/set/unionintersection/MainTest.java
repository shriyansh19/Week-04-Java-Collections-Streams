package com.collections.set.unionintersection;

import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class UnionIntersectionTest {

    @Test
    void testUnion() {
        UnionIntersectionSolution solver = new UnionIntersectionSolution();
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 4, 5);

        Set<Integer> union = solver.union(set1, set2);
        assertEquals(Set.of(1, 2, 3, 4, 5), union);
    }

    @Test
    void testIntersection() {
        UnionIntersectionSolution solver = new UnionIntersectionSolution();
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 4, 5);

        Set<Integer> intersection = solver.intersection(set1, set2);
        assertEquals(Set.of(3), intersection);
    }
}