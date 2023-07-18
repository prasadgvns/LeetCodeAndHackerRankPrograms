package com.learning.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayEasyProgramsTest {

    @Test
    public void runningSumTest(){
        int[] nums = {1, 2, 3, 4};
        int[] expectedOutput = {1, 3, 6, 10};

        assertArrayEquals(expectedOutput, ArrayEasyPrograms.runningSum(nums));

        int[] nums1 = {1, 1, 1, 1, 1, 1};
        int[] expectedOutput1 = {1, 2, 3, 4, 5, 6};

        assertArrayEquals(expectedOutput1, ArrayEasyPrograms.runningSum(nums1));

        int[] nums2 = {3, 1, 2, 10, 1};
        int[] expectedOutput2 = {3, 4, 6, 16, 17};

        assertArrayEquals(expectedOutput2, ArrayEasyPrograms.runningSum(nums2));
    }

    @Test
    public void runningSumOptimumTest(){
        int[] nums = {1, 2, 3, 4};
        int[] expectedOutput = {1, 3, 6, 10};

        assertArrayEquals(expectedOutput, ArrayEasyPrograms.runningSumOptimum(nums));

        int[] nums1 = {1, 1, 1, 1, 1, 1};
        int[] expectedOutput1 = {1, 2, 3, 4, 5, 6};

        assertArrayEquals(expectedOutput1, ArrayEasyPrograms.runningSumOptimum(nums1));

        int[] nums2 = {3, 1, 2, 10, 1};
        int[] expectedOutput2 = {3, 4, 6, 16, 17};

        assertArrayEquals(expectedOutput2, ArrayEasyPrograms.runningSumOptimum(nums2));
    }
}
