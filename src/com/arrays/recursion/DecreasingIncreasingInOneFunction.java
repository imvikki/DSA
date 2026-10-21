package com.arrays.recursion;

/*
 Input : 4
 Output : 4 3 2 1 1 2 3 4
*/

public class DecreasingIncreasingInOneFunction {
    public static void main(String[] args) {
        printDecreasingIncreasingInOneFunction(4);
    }

    private static void printDecreasingIncreasingInOneFunction(int input) {
        if (input == 0) {
            return;
        }
        System.out.print(input + " ");
        printDecreasingIncreasingInOneFunction(input - 1);
        System.out.print(input + " ");
    }
}
