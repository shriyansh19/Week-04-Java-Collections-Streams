package com.collections.list.rotateelements;

import java.util.List;
import java.util.Collections;

// Class to rotate elements in a list
public class RotateSolution {

    // Rotates the list by the given number of positions
    public <T> void rotateList(List<T> list, int positions) {
        Collections.rotate(list, positions);
    }
}