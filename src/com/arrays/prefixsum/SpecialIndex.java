package com.arrays.prefixsum;


/*Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element
from these indices makes the sum of even-indexed and odd-indexed array elements equal.*/
public class SpecialIndex {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{2, 1, 6, 4}));
        System.out.println(solve(new int[]{1, 1, 1}));
    }

    private static int solve(int[] input) {

        int[] oddArray = new int[input.length];
        int[] evenArray = new int[input.length];

        evenArray[0] = input[0];
        oddArray[0] = 0;
        for (int i = 1; i < input.length; i++) {
            if (i % 2 == 0) {
                oddArray[i] = oddArray[i - 1];
                evenArray[i] = evenArray[i - 1] + input[i];
            } else {
                evenArray[i] = evenArray[i - 1];
                oddArray[i] = oddArray[i - 1] + input[i];
            }
        }

        int count = 0;
        for (int i = 0; i < input.length; i++) {
            int sumOfOdd = ((i == 0) ? 0 : oddArray[i - 1]) + evenArray[input.length - 1] - evenArray[i];
            int sumOfEven = ((i == 0) ? 0 : evenArray[i - 1]) + oddArray[input.length - 1] - oddArray[i];

            if (sumOfEven == sumOfOdd) {
                count++;
            }
        }

        return count;
    }

}
