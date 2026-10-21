package com.arrays.hashing;

/*
You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.
Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.
NOTE: if B > N, return an empty array.

Explanation 1:

 A=[1, 2, 1, 3, 4, 3] and B = 3
 All windows of size B are
 [1, 2, 1]
 [2, 1, 3]
 [1, 3, 4]
 [3, 4, 3]
 So, we return an array [2, 3, 3, 2].

Explanation 2:

 Window size is 1, so the output array is [1, 1, 1, 1].
*/


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DistinctNumbersInWindow {
    public static void main(String[] args) {
        Arrays.stream(solve(new int[]{1, 2, 1, 3, 4, 3}, 3)).forEach(result -> System.out.print(result + " "));
        System.out.println("");
        Arrays.stream(solve(new int[]{1, 1, 2, 2}, 1)).forEach(result -> System.out.print(result + " "));
        System.out.println("");
        Arrays.stream(optimalSolution(new int[]{1, 2, 1, 3, 4, 3}, 3)).forEach(result -> System.out.print(result + " "));
        System.out.println("");
        Arrays.stream(optimalSolution(new int[]{1, 1, 2, 2}, 1)).forEach(result -> System.out.print(result + " "));
    }

    private static int[] solve(int[] A, int B) {
        int[] result = new int[A.length - B + 1];
        int i = 0;
        int j = B - 1;

        while (j < A.length) {
            HashSet<Integer> hs = new HashSet<>();
            int distinctCount = 0;
            int k = i;
            while (k <= j) {
                if(!hs.contains(A[k])) {
                    distinctCount++;
                }
                hs.add(A[k]);
                k++;
            }
            result[i] = distinctCount;
            i++;
            j++;
        }
        return result;
    }

    public static int[] optimalSolution(int[] A, int B) {
        if (A == null || A.length < B) {
            return new int[0];
        }

        int n = A.length;
        // Output array size for a window of size B
        int[] result = new int[n - B + 1];
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Step 1: Process the first window of size B
        for (int i = 0; i < B; i++) {
            freqMap.put(A[i], freqMap.getOrDefault(A[i], 0) + 1);
        }
        result[0] = freqMap.size();

        // Step 2: Slide the window from index B to end of array
        for (int i = B; i < n; i++) {
            // Remove outgoing element from left boundary (A[i - B])
            int outgoing = A[i - B];
            if (freqMap.get(outgoing) == 1) {
                freqMap.remove(outgoing);
            } else {
                freqMap.put(outgoing, freqMap.get(outgoing) - 1);
            }

            // Add incoming element at right boundary (A[i])
            int incoming = A[i];
            freqMap.put(incoming, freqMap.getOrDefault(incoming, 0) + 1);

            // Record number of distinct elements in current window
            result[i - B + 1] = freqMap.size();
        }

        return result;
    }
}
