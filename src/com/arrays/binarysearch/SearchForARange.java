package com.arrays.binarysearch;

import java.util.Arrays;

/*
Given a sorted array of integers A (0-indexed) of size N, find the left most and the right most index of a given integer B in the array A.

Return an array of size 2, such that
          First element = Left most index of B in A
          Second element = Right most index of B in A.
If B is not found in A, return [-1, -1].

Note : Note: The time complexity of your algorithm must be O(log n)..

Input 1:

 A = [5, 7, 7, 8, 8, 10]
 B = 8

Input 2:

 A = [5, 17, 100, 111]
 B = 3

Explanation 1:

 The first occurrence of 8 in A is at index 3.
 The last occurrence of 8 in A is at index 4.
 ans = [3, 4]

Explanation 2:

 There is no occurrence of 3 in the array.

*/
public class SearchForARange {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{5, 7, 7, 8, 8, 10}, 8)));
        System.out.println(Arrays.toString(solve(new int[]{5, 17, 100, 111}, 8)));
    }

    private static int[] solve(int[] A, int B) {
        int l = 0;
        int r = A.length - 1;
        int leftIndex = -1;
        int rightIndex = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if(A[mid] == B) {
                leftIndex = mid;
                r = mid - 1;
            } else if (A[mid] > B) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        l = 0;
        r = A.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if(A[mid] == B) {
                rightIndex = mid;
                l = mid + 1;
            } else if (A[mid] > B) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

       return new int[]{leftIndex, rightIndex};
    }
}
