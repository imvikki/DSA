package com.arrays.binarysearch;

/*
Input 1:

A = [1, 3, 5, 6]
B = 5

Output 1 : 2

Input 2:

A = [1, 4, 9]
B = 3

Output 2 : 1

Explanation 1:

The target value is present at index 2.

Explanation 2:

The target value should be inserted at index 1.
*/
public class SortedInsertPosition {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 3, 5, 6}, 5));
        System.out.println(solve(new int[]{1, 4, 9}, 3));
    }

    private static int solve(int[] A, int B) {
        int l = 0;
        int r = A.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (A[mid] == B) {
                return mid;
            } else if (A[mid] < B) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;   // insert position
    }
}
