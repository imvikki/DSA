package com.arrays.slidingwindow_contributiontechnique;

/*Given an array of integers A and an integer B, find and return the minimum number of swaps required to
bring all the numbers less than or equal to B together.

Note: It is possible to swap any two elements, not necessarily consecutive.*/
public class MinimumSwaps {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 12, 10, 3, 14, 10, 5}, 8));
    }

    private static int solve(int[] input, int val) {
        int greaterValCount = 0;

        for(int i = 0; i < input.length; i++){
            if(input[i] > val) {
                greaterValCount++;
            }
        }

        int elementInWindow = 0;
        for(int i = 0; i < greaterValCount; i++){
            if(input[i] > val) {
                elementInWindow++;
            }
        }

        int left = 0;
        int right = greaterValCount - 1;
        int minSwap = input.length;
        while(right < input.length){
            if(input[left] > val){
                elementInWindow--;
            }
            if(input[right] > val){
                elementInWindow++;
            }
            left++;
            right++;

            minSwap = Math.min(elementInWindow, minSwap);
        }
        return greaterValCount - minSwap;
    }
}
