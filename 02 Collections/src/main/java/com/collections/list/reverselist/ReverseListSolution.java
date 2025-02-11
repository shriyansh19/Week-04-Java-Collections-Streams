package com.collections.list.reverselist;

import java.util.List;

// Class to reverse a list without using built-in methods
public class ReverseListSolution {

    // Reverses the elements of the list
    public <T> void reverseList(List<T> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}