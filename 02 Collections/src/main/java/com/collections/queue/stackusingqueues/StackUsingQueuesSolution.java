package com.collections.queue.stackusingqueues;

import java.util.Queue;
import java.util.LinkedList;

// Class to implement a stack using two queues
public class StackUsingQueuesSolution<T> {
    private Queue<T> queue1 = new LinkedList<>();
    private Queue<T> queue2 = new LinkedList<>();

    // Push an element onto the stack
    public void push(T element) {
        queue2.add(element);
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }
        Queue<T> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // Pop the top element from the stack
    public T pop() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue1.poll();
    }

    // Peek at the top element of the stack
    public T peek() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue1.peek();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}