package com.collections.list.nthfromend;

import java.util.LinkedList;
import java.util.List;

// Class to find the Nth element from the end of a list
public class NthFromEndSolution {

    // Finds the Nth element from the end of the list
    public <T> T findNthFromEnd(List<T> list, int n) {
        if (list == null || list.isEmpty() || n <= 0 || n > list.size()) {
            throw new IllegalArgumentException("Invalid input");
        }

        // Use two pointers to find the Nth element from the end
        T slow = list.get(0);
        T fast = list.get(n - 1);

        for (int i = n; i < list.size(); i++) {
            slow = list.get(i - n + 1);
            fast = list.get(i);
        }

        return slow;
    }
}