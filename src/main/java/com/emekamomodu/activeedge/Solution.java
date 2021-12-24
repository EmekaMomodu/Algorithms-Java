package com.emekamomodu.activeedge;

import java.util.HashSet;
import java.util.Set;

/**
 * Write a simple and efficient Java >= 8 program that returns the smallest non-occurring
 * integer in a given Array.
 * E.g: Given an Array1 = [1, 3, 6, 4, 1, 2] returns 5, and Array2 = [5, -1, -3] returns 1
 * */
public class Solution {

    private final Set<Integer> positiveIntegers = new HashSet<>();

    public int findSmallestNonOccurringPositiveInteger(int[] inputArray) {
        getAllPositiveIntegers(inputArray);
        int inputArrayLength = inputArray.length;
        for (int i = 1; i <= inputArrayLength + 1; i++) {
            if (!positiveIntegers.contains(i)) {
                return i;
            }
        }
        return 1;
    }

    private void getAllPositiveIntegers(int[] inputArray) {
        for (int integer : inputArray) {
            if (integer > 0) {
                positiveIntegers.add(integer);
            }
        }
    }
}
