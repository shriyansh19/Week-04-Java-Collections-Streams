package com.exception.multiplecatchblocks;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        ArrayOperations.printValueAtIndex(array, 5); // Invalid index
        ArrayOperations.printValueAtIndex(null, 0);  // Null array
    }
}