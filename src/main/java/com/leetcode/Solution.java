package com.leetcode;

public class Solution {
    public int tribonacci(int n) {
        int[] lookUp = new int[38];
        lookUp[0] = 0;
        lookUp[1] = 1;
        lookUp[2] = 1;

        if(n < 3)
            return lookUp[n];
        return -1;
    }

}
