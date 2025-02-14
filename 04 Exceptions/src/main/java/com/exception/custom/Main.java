package com.exception.custom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        try {
            AgeValidator.validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}