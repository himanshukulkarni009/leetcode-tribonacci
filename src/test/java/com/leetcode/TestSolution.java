package com.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
    Solution s;
    @Before
    public void setup() {
        s = new Solution();
    }
    @Test
    public void givenZeroThenItShouldReturnZero() {
        int tribonacci = s.tribonacci(0);
        Assert.assertEquals(0, tribonacci);
    }

    @Test
    public void whenGivenOneThenItShouldReturnOne() {
        int tribonacci = s.tribonacci(1);
        Assert.assertEquals(1, tribonacci);
    }

    @Test
    public void whenGivenTwoThenItShouldReturnOne() {
        int tribonacci = s.tribonacci(2);
        Assert.assertEquals(1, tribonacci);
    }


}
