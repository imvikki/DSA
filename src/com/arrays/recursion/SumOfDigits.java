package com.arrays.recursion;

/*Explanation 1: Sum of digits of 46 = 4 + 6 = 10
Explanation 2: Sum of digits of 11 = 1 + 1 = 2*/
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
    }

    private static int sumOfDigits(int input) {
        if (input < 10) {
            return input;
        }
        return sumOfDigits(input / 10) + input % 10;
    }
}
