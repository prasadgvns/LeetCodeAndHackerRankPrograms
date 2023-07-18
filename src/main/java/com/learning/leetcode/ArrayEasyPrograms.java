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

    public static int[] leftRightDifference(int[] nums){
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] output = new int[n];

        for(int i = 0 ; i < n; i++){
            int sum = 0;

            for(int j = 0 ; j < i; j++){
                sum += nums[j];
            }

            leftSum[i] = sum;
        }

        for(int i = 0 ; i < n; i++){
            int sum = 0;

            for(int j = n-1 ; j > i; j--){
                sum += nums[j];
            }

            rightSum[i] = sum;
        }

        for(int i = 0; i < n ; i++){
            output[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return output;
    }

    public static int[] leftRightDifferenceOptimum(int[] nums){
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] output = new int[n];

        for(int i = 1; i < n; i++){
            leftSum[i] = leftSum[i -1] + nums[i -1];
        }

        for(int i = n -2 ; i >= 0; i--){
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        for(int i = 0; i < n ; i++){
            output[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return output;
    }
}
