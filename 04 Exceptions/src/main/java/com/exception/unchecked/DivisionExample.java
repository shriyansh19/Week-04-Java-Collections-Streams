package com.exception.unchecked;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionExample {
    public static void divideNumbers() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();
            System.out.println("Result: " + (numerator / denominator));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: Please enter numeric values");
        } finally {
            scanner.close();
        }
    }
}