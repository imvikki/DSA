package com.arrays.prefixsum;

import java.util.Arrays;

public class PrefixSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rangeSum(new int[]{1, 2, 3, 4, 5}, new int[][]{{0, 3}, {1, 2}})));
        System.out.println(Arrays.toString(rangeSum(new int[]{2, 2, 2}, new int[][]{{0, 0}, {1, 2}})));
    }

    public static long[] rangeSum(int[] A, int[][] B) {
        for(int i = 1; i < A.length; i++) {
            A[i] += A[i-1];
        }

        System.out.println(Arrays.toString(A));

        long[] res = new long[B.length];
        for(int j = 0; j < B.length; j++) {
            if(j == 0) {
                res[j] = A[B[j][1]];
            } else {
                res[j] = A[B[j][1]] - A[j-1];
            }
        }
        return res;
    }
}
