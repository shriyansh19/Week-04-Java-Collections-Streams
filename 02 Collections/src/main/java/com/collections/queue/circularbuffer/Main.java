package com.collections.queue.circularbuffer;

// Main class to demonstrate the circular buffer
public class Main {
    public static void main(String[] args) {
        CircularBufferSolution<Integer> buffer = new CircularBufferSolution<>(3);
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        buffer.add(4); // Overwrites the oldest element (1)

        System.out.println("Buffer: " + buffer.getBuffer());
    }
}