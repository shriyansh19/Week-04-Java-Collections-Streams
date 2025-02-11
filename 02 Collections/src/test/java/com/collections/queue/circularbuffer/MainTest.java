package com.collections.queue.circularbuffer;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CircularBufferTest {

    @Test
    void testCircularBuffer() {
        CircularBufferSolution<Integer> buffer = new CircularBufferSolution<>(3);
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        buffer.add(4); // Overwrites the oldest element (1)

        assertEquals(List.of(2, 3, 4), buffer.getBuffer());
    }
}