package com.collections.queue.circularbuffer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// Class to simulate a circular buffer using a queue
public class CircularBufferSolution<T> {
    private Queue<T> buffer;
    private int capacity;

    public CircularBufferSolution(int capacity) {
        this.capacity = capacity;
        this.buffer = new ArrayDeque<>(capacity);
    }

    // Add an element to the buffer
    public void add(T element) {
        if (buffer.size() == capacity) {
            buffer.poll(); // Remove the oldest element if the buffer is full
        }
        buffer.add(element);
    }

    // Get the elements in the buffer
    public List<T> getBuffer() {
        return new ArrayList<>(buffer);
    }
}