package com.arrays;

public class SumOfMaximumAndMinimumElementInTheGivenArray {

    public static void main(String[] args) {
        System.out.println(sumOfMaximumAndMinimum(new int[]{-2, 1, -4, 5, 3}));
        System.out.println(sumOfMaximumAndMinimum(new int[]{1, 3, 4, 1}));
    }

    public static int sumOfMaximumAndMinimum(int[] nums) {
        int currentMin = Integer.MAX_VALUE;
        int currentMax = Integer.MIN_VALUE;

        for (int num : nums) {
            currentMin = Math.min(currentMin, num);
            currentMax = Math.max(currentMax, num);
        }

        return currentMin + currentMax;
    }
}