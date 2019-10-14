package com.fcp.sols;

import java.util.Stack;

/**
 * An example of solving a problem on Leetcode.
 * @link https://leetcode.com/problems/split-a-string-in-balanced-strings/
 * @desc Balanced strings are those who have equal quantity of 'L' and 'R' characters.
 * Given a balanced string s split it in the maximum amount of balanced strings.
 * Return the maximum amount of splitted balanced strings.
 */
public class BalanceStringSplit {
    public int balancedStringSplit(String s) {
        int diff = 0;
        int res = 0;
        for (char c: s.toCharArray()) {
            diff += (c == 'L') ? 1 : -1;
            if (diff == 0)
                res++;
        }
        return res;
    }
}
