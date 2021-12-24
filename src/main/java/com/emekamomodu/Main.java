package com.emekamomodu;

import com.emekamomodu.activeedge.Solution;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] testInput = new int[]{1, 3, 6, 4, 1, 2};
        System.out.println("testInput::: " + Arrays.toString(testInput));
        System.out.println("Finding Smallest Non-Occurring Positive Integer");
        int result = solution.findSmallestNonOccurringPositiveInteger(testInput);
        System.out.println("result::: " + result);
    }
}
