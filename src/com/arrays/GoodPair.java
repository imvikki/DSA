package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GoodPair {

    public static void main(String[] args) {
        System.out.println(goodPair(new int[]{2, 4, 1, 3, 2}, 7));
        System.out.println(goodPair(new int[]{1, 3, -4, 1}, 10));
        System.out.println(goodPair(new int[]{1, 3, -4, 1}, -3));
    }

    public static boolean goodPair(int[] nums, int expectedSum) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if(nums[left] + nums[right] == expectedSum) {
                return true;
            } else if(nums[left] + nums[right] < expectedSum) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    public static boolean goodPairOptimised(int[] nums, int expectedSum) {
        if (nums == null || nums.length < 2) return false;

        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            int complement = expectedSum - num;
            if (seen.contains(complement)) {
                return true; // Found matching pair
            }
            seen.add(num);
        }

        return false;
    }
}