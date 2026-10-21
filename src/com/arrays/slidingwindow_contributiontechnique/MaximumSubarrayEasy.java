package com.arrays.slidingwindow_contributiontechnique;


/*Why the Output is 12For C = [2, 1, 3, 4, 5] and B = 12:
The sum of the entire array [2, 1, 3, 4, 5] is 2 + 1 + 3 + 4 + 5 = 15 (which exceeds 12).
The contiguous subarray [1, 3, 4, 5] has sum 1 + 3 + 4 + 5 = 13 (exceeds 12).
The contiguous subarray [2, 1, 3, 4] has sum 2 + 1 + 3 + 4 = 10 <= 12.
The contiguous subarray [3, 4, 5] has sum 3 + 4 + 5 = 12 <= 12.

Since 12 <= 12, the maximum valid sum is 12.

A is the length of the given array*/
public class MaximumSubarrayEasy {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{2, 1, 3, 4, 5}, 5, 12));
    }

    private static int solve(int[] input, int a, int b) {
        int maxSum = 0;
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < a; end++) {
            currentSum += input[end];
            while (currentSum > b && start <= end) {
                currentSum -= input[start];
                start++;
            }
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
