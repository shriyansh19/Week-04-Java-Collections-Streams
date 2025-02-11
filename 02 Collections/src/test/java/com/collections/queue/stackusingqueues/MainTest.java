package com.collections.queue.stackusingqueues;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackUsingQueuesTest {

    @Test
    void testStackOperations() {
        StackUsingQueuesSolution<Integer> stack = new StackUsingQueuesSolution<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.peek());
    }
}