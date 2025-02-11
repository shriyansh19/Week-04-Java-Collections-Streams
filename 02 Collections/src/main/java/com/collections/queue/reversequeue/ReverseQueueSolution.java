package com.collections.queue.reversequeue;

import java.util.Queue;
import java.util.Stack;

// Class to reverse a queue using a stack
public class ReverseQueueSolution {

    // Reverses the elements of the queue
    public <T> void reverseQueue(Queue<T> queue) {
        Stack<T> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}