package com.arrays.prefixsum;

public class BestTimeToBuyAndSellStocks {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 4, 5, 2, 4}));
    }

    private static int solve(int[] input) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < input.length; i++) {
            if(input[i] < minPrice){
                minPrice = input[i];
            } else {
                maxProfit = Math.max(maxProfit, input[i] - minPrice);
            }
        }
        return maxProfit;
    }
}
