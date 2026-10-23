package com.arrays.binarysearch;
/*
* Example Input

Input 1:

A = [
      [1,   3,  5,  7]
      [10, 11, 16, 20]
      [23, 30, 34, 50]
    ]
B = 3

Input 2:

A = [
      [5, 17, 100, 111]
      [119, 120, 127, 131]
    ]
B = 3


Example Output

Output 1:

1
Output 2:

0

Example Explanation

Explanation 1:

 3 is present in the matrix at A[0][1] position so return 1.
Explanation 2:

 3 is not present in the matrix so return 0.
* */
public class MatrixSearch {
    public static void main(String[] args) {
        System.out.println(solve(new int[][]{{1,   3,  5,  7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 3));
    }
    
    private static int solve(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;

        int l = 0;
        int r = n * m - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int val = A[mid / m][mid % m];

            if (val == B) {
                return 1;
            } else if (val < B) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return 0;
    }
}
