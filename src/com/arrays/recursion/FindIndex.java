package com.arrays.recursion;

/*
For Input 1 : A = [-3, 5, 6, 2], B = 6
At index 0 we have -3
At index 1 we have 5
At index 2 we have 6 which is equal to B

For Input 2 : A = [0, 1, 0, 2], B = 3
The element B = 3 is nowhere to be found in the array so we print -1
*/
public class FindIndex {
    public static void main(String[] args) {
        System.out.println("output : " + findIndex(new int[]{-3, 5, 6, 2}, 6, 0));
        System.out.println("output : " + findIndex(new int[]{0, 1, 0, 2}, 3, 0));
    }

    private static Object findIndex(int[] A, int B, int index) {
        if(A.length > index && A[index] == B) {
            return index;
        } else if (A.length == index) {
            return -1;
        }

        return findIndex(A, B, index + 1);
    }
}
