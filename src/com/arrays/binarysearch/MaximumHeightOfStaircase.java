package com.arrays.binarysearch;
/*
Example Input

Input 1:

 A = 10

Input 2:

 A = 20

Example Output

Output 1: 4
Output 2: 5

Example Explanation

Explanation 1:

 The stairs formed will have height 1, 2, 3, 4.
Explanation 2:

 The stairs formed will have height 1, 2, 3, 4, 5.
* */
public class MaximumHeightOfStaircase {
    public static void main(String[] args) {
        System.out.println(solve(20));
        System.out.println(solve(11));
    }

    private static int solve(int A) {
        long l = 1;
        long r = A;          // height can never exceed A
        long ans = 0;

        while (l <= r) {
            long mid = l + (r - l) / 2;
            long need = mid * (mid + 1) / 2;   // blocks needed for height mid

            if (need <= A) {
                ans = mid;        // mid is possible, try taller
                l = mid + 1;
            } else {
                r = mid - 1;      // too tall
            }
        }
        return (int) ans;
    }
}
