package com.exception.propagation;

/**
 * Main class to handle exception propagation.
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Call method2, which calls method1
            ExceptionPropagation.method2();
        } catch (ArithmeticException e) {
            // Handle the propagated exception
            System.out.println("Handled exception in main");
        }
    }
}