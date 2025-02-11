package com.collections.queue.reversequeue;

import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import static org.junit.jupiter.api.Assertions.*;

class ReverseQueueTest {

    @Test
    void testReverseQueue() {
        ReverseQueueSolution reverser = new ReverseQueueSolution();
        Queue<Integer> queue = new LinkedList<>(List.of(10, 20, 30));

        reverser.reverseQueue(queue);
        assertEquals(List.of(30, 20, 10), queue);
    }
}