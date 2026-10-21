package com.arrays.slidingwindow_contributiontechnique;

public class SubarrayWithGivenSumAndLength {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{4, 3, 2, 6, 1}, 3, 11));
    }

    private static int solve(int[] input, int length, int target) {
        int expectedTarget = 0;

        for(int i = 0; i < length; i++){
            expectedTarget += input[i];
        }

        if(expectedTarget == target) {
            return 1;
        }

        int start = 0;
        int end = length;

        while(end < input.length){
            expectedTarget += input[end] - input[start];
            if(expectedTarget == target){
                return 1;
            }
            start++;
            end++;
        }

        return 0;
    }
}
