package com.exception.propagation;

/**
 * Demonstrates exception propagation through multiple methods.
 */
public class ExceptionPropagation {
    /**
     * Method that throws an ArithmeticException.
     */
    public static void method1() {
        // Division by zero causes an ArithmeticException
        System.out.println(10 / 0);
    }

    /**
     * Calls method1, propagating the exception.
     */
    public static void method2() {
        method1();
    }
}