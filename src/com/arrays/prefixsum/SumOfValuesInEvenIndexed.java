package com.arrays.prefixsum;

import java.util.Arrays;

public class SumOfValuesInEvenIndexed {

    public static void main(String[] args) {
        sumOfValuesInEvenIndexedInRange(new int[]{2, 8, 3, 9, 15}, new int[][]{{1, 4}, {0, 2}, {2, 3}});
        sumOfValuesInEvenIndexedInRange(new int[]{5, 15, 25, 35, 45}, new int[][]{{1, 1}, {0, 0}});
    }

    private static void sumOfValuesInEvenIndexedInRange(int[] input, int[][] queries) {
        int[] res = new int[queries.length];

        for(int i = 1; i < input.length; i++) {
            if(i % 2 == 0) {
                input[i] += input[i - 1] ;
            } else {
                input[i] = input[i - 1];
            }
        }

        for(int i = 0; i < queries.length; i++) {
            if(queries[i][0] == 0) {
                res[i] = input[queries[i][1]];
            } else {
                res[i] = input[queries[i][1]] - input[queries[i][0] - 1];
            }
        }
        System.out.println(Arrays.toString(res));
    }

}
