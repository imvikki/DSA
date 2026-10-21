package com.arrays.recursion;

/*The Fibonacci numbers are the numbers in the following integer sequence.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..

In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation:

Fn = Fn-1 + Fn-2

Given a number A, find and return the Ath Fibonacci Number using recursion.

Given that F0 = 0 and F1 = 1.
*/


public class Fibonacci2 {
    public static void main(String[] args) {
        System.out.println(getFibonacci(9));
    }

    private static int getFibonacci(int A) {
        if (A == 0 || A == 1) {
            return A;
        }
        return getFibonacci(A - 1) + getFibonacci(A - 2);
    }
}
