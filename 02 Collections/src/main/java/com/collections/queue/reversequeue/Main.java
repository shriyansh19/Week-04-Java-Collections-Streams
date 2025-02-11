package com.collections.queue.reversequeue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Main class to demonstrate reversing a queue
public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(List.of(10, 20, 30));
        System.out.println("Original Queue: " + queue);

        ReverseQueueSolution reverser = new ReverseQueueSolution();
        reverser.reverseQueue(queue);

        System.out.println("Reversed Queue: " + queue);
    }
}