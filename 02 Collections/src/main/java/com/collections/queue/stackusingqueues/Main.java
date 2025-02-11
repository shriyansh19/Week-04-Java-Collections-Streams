package com.collections.queue.stackusingqueues;

// Main class to demonstrate a stack using queues
public class Main {
    public static void main(String[] args) {
        StackUsingQueuesSolution<Integer> stack = new StackUsingQueuesSolution<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());
    }
}