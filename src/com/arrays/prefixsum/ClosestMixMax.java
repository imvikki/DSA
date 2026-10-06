package com.arrays.prefixsum;

/*
Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
and at least one occurrence of the minimum value of the array.
*/

    public class ClosestMixMax {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{2, 6, 1, 6, 9}));
    }

    private static int solve(int[] input) {
        if(input == null || input.length == 0) return 0;

        int min = input[0];
        int max = input[0];

        for (int i = 1; i < input.length; i++) {
            min = Math.min(min, input[i]);
            max = Math.max(max, input[i]);
        }

        int lastMin = -1;
        int lastMax = -1;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < input.length; i++) {
            if(input[i] == min) {
                lastMin = i;
                if(lastMax != -1) {
                    minLength = Math.min(minLength, i - lastMax + 1);
                }
            }
            if(input[i] == max) {
                lastMax = i;
                if(lastMin != -1) {
                    minLength = Math.min(minLength, i - lastMin + 1);
                }
            }
        }

        return minLength;
    }
}
