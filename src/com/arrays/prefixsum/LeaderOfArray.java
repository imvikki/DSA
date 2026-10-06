package com.arrays.prefixsum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*Given an integer array A containing N distinct integers, you have to find all the leaders in array A.
An element is a leader if it is strictly greater than all the elements to its right side.

NOTE: The rightmost element is always a leader.*/
public class LeaderOfArray {
    public class Solution {
        public static List<Integer> findLeaders(int[] A) {
            List<Integer> leaders = new ArrayList<>();
            if (A == null || A.length == 0) return leaders;

            int n = A.length;

            // The rightmost element is always a leader
            int maxSoFar = A[n - 1];
            leaders.add(maxSoFar);

            // Traverse right-to-left carrying forward maxSoFar
            for (int i = n - 2; i >= 0; i--) {
                if (A[i] > maxSoFar) {
                    leaders.add(A[i]);
                    maxSoFar = A[i]; // Update the state carried forward
                }
            }

            // Reverse to maintain original left-to-right order (optional based on requirements)
            Collections.reverse(leaders);
            return leaders;
        }

        public static void main(String[] args) {
            int[] arr = {16, 17, 4, 3, 5, 2};
            System.out.println(findLeaders(arr)); // Output: [17, 5, 2]
        }
    }
}
