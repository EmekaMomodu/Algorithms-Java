package com.emekamomodu.microsoft;

/**
 * @author CMOMODU
 * @version 1.0
 * @date 12/10/21 11:42 AM
 */
public class Solution {

    /**
     * Time complexity: O(N)
     *
     * We iterate over all the characters of string text which requires NN operations.
     *
     * Space complexity: O(1)
     *
     * All we need is the 55 variables to store the frequency of characters. Hence the space complexity is constant.
     *
     * */

    public int solution(String S) {
        int bCount = 0, aCount = 0, lCount = 0, oCount = 0, nCount = 0;

        // Count the frequency of all the five characters
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'B') {
                bCount++;
            } else if (S.charAt(i) == 'A') {
                aCount++;
            } else if (S.charAt(i) == 'L') {
                lCount++;
            } else if (S.charAt(i) == 'O') {
                oCount++;
            } else if (S.charAt(i) == 'N') {
                nCount++;
            }
        }

        // Find the potential of each character.
        // Except for 'l' and 'o' the potential is equal to the frequency.
        lCount = lCount / 2;
        oCount = oCount / 2;

        // Find the bottleneck.
        return Math.min(bCount, Math.min(aCount, Math.min(lCount, Math.min(oCount, nCount))));
    }
    
}
