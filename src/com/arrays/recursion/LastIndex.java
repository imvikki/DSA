package com.arrays.recursion;

/*
For Input 1 : A = [6, 5, 6, 2]  B = 6
At index 0 we have 6  which is equal to B, but it's not the last occurence.
At index 1 we have 5
At index 2 we have 6 which is equal to B, and it's the last occurence as well.

So the output is 2 and not 0.
For Input 2 : A = [0, 1, 0, 2]  B = 3
The element B = 3 is nowhere to be found in the array so we print -1
*/
public class LastIndex {
    public static void main(String[] args) {
        System.out.println(lastIndex(new int[]{6, 5, 6, 2}, 6, 3));
        System.out.println(lastIndex(new int[]{0, 1, 0, 2}, 3, 3));
    }

    private static int lastIndex(int[] A, int B, int index) {
        if (index < 0) {
            return -1;
        } else if (A[index] == B) {
            return index;
        }
        return lastIndex(A, B, index - 1);
    }
}
