package com.arrays.hashing;

import java.util.HashSet;

public class LongestSubStringWithoutRepeating {

    public static void main(String[] args) {
        System.out.println(solve("abcacdeb"));
    }

    private static int solve(String input) {
        int i = 0;
        int j = 0;
        int maxLength = 0;

        HashSet<Character> charSet = new HashSet<>();
        while(j < input.length()) {
            if(!charSet.contains(input.charAt(j))) {
                charSet.add(input.charAt(j));
                j++;
                maxLength = Math.max(maxLength, j - i);
            } else {
                charSet.remove(input.charAt(i));
                i++;
            }
        }
        return maxLength;
    }
}
