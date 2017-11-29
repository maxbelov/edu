package com.hackerrank.arrays;

import org.junit.Assert;
import org.junit.Test;

public class Array2DTest {

    @Test
    public void testCase3() {
        int[][] testMatrix = new int[][] {
                {-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5}
        };

        Assert.assertEquals(-6, Array2D.getMaxHourglassSum(testMatrix));
    }

}
