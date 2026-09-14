package com.arrays;

import java.util.Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {
        System.out.println(minimumTimeInSecondsToMakeAllElementsOfTheArrayEqual(new int[]{2, 4, 1, 3, 2}));
        System.out.println(minimumTimeInSecondsToMakeAllElementsOfTheArrayEqual(new int[]{1, 3, -4, 1}));
    }

    public static int minimumTimeInSecondsToMakeAllElementsOfTheArrayEqual(int[] nums) {
        int maxElement = Arrays.stream(nums).max().getAsInt();
        int secondLargest = 0;
        for (int num : nums) {
            if (num != maxElement) {
                secondLargest = Math.max(num, secondLargest);
            }
        }
        return secondLargest;
    }
}