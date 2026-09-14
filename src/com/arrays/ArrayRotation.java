package com.arrays;

import java.util.Arrays;

public class ArrayRotation {

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4};
        arrayRotation(input1, 2);
        System.out.println(Arrays.toString(input1));
        int[] input2 = {2, 5, 6};
        arrayRotation(input2, 1);
        System.out.println(Arrays.toString(input2));
    }

    public static void arrayRotation(int[] nums, int k) {
        if(k >= nums.length) {
            k = k % nums.length;
        }
        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, nums.length - 1);
    }

    public static void reverseArray(int[] nums, int from, int to) {
        while (from < to) {
            int fromValue = nums[from];
            nums[from] = nums[to];
            nums[to] = fromValue;
            from++;
            to--;
        }
    }
}