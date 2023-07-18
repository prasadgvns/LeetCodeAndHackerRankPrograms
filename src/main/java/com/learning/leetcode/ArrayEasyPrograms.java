package com.learning.leetcode;

public class ArrayEasyPrograms {


    public static int[] runningSum(int[] nums){
        int[] output = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int sum = 0;

            for(int j = 0; j <= i; j++){
                sum += nums[j];
            }

            output[i] = sum;
        }

        return output;
    }

    public static int[] runningSumOptimum(int[] nums){
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i - 1] + nums[i];
        }

        return nums;
    }
}
