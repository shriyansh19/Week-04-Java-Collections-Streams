package com.collections.set.settosortedlist;

import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// Class to convert a set to a sorted list
public class SetToSortedListSolution {

    // Converts a set of integers to a sorted list
    public List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list); // Sort the list in ascending order
        return list;
    }
}