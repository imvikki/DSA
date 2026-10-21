package com.arrays.recursion;

/*

Explanation 1:
 The Maximum element of the array A, [12, 10, 3, 4, 5] is 12

Explanation 2:
 The Maximum element of the array A, [1, -5, 80, -40] is 80

 */
public class MaxElementOfArray {
    public static void main(String[] args) {
        System.out.println(maxElement(new int[]{12, 10, 3, 4, 5}, 0, Integer.MIN_VALUE));
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(maxElement(new int[]{1, -5, 80, -40}, 0, Integer.MIN_VALUE));
    }

    static int maxElement(int[] input, int index, int maxValue) {
        if (input.length == index) {
            return maxValue;
        }
        System.out.println("index: " + index + ", maxValue: " + maxValue);
        return maxElement(input, index + 1, Math.max(maxValue, input[index]));
    }
}
