package com.arrays.slidingwindow_contributiontechnique;

public class SumOfAllSubarrays {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 3}));
        System.out.println(solve(new int[]{2, 1, 3}));
    }

    private static int solve(int[] input) {
        int ans = 0;
        for (int i = 0; i < input.length; i++) {
            int occurrence = (i + 1) * (input.length - i);
            ans += input[i] * occurrence;
        }
        return ans;
    }
}
