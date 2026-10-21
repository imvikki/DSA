package com.arrays.recursion;

/*

Explanation 1:

 Sum of digits of (83557) = 28
 Sum of digits of (28) = 10
 Sum of digits of (10) = 1.
 Single digit is 1, so it's a magic number. Return 1.


Explanation 2:

 Sum of digits of (1291) = 13
 Sum of digits of (13) = 4
 Single digit is not 1, so it's not a magic number. Return 0.

 */
public class IsMagic {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(83557));
    }

    static int sumOfDigits(int input) {
        if(input == 1) {
            return 1;
        } else if(input < 10) {
            return 0;
        }
        int sum = 0;
        while (input > 0) {
            int digit = input % 10;
            input = input / 10;
            sum += digit;
        }
        System.out.println(sum);
        return sumOfDigits(sum);
    }
}
