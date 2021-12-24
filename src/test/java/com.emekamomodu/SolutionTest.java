package com.emekamomodu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.emekamomodu.activeedge.Solution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    @DisplayName("Test Case 1")
    void testCase1() {
        assertEquals(5, solution.findSmallestNonOccurringPositiveInteger(new int[]{1, 3, 6, 4, 1, 2}));
    }

    @Test
    @DisplayName("Test Case 2")
    void testCase2() {
        assertEquals(1, solution.findSmallestNonOccurringPositiveInteger(new int[]{5, -1, -3}));
    }

    @Test
    @DisplayName("Test Case 3")
    void testCase3() {
        assertEquals(1, solution.findSmallestNonOccurringPositiveInteger(new int[]{}));
    }

}
