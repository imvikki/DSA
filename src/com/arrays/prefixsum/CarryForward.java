package com.arrays.prefixsum;

public class CarryForward {

    public static void main(String[] args) {
        System.out.println(SpecialSubsequencesAG("ABCGAG"));
        System.out.println("-----------------------------");
        System.out.println(SpecialSubsequencesAG("GAB"));
    }

    public static int SpecialSubsequencesAG(String input) {
        char[] charArray = input.toCharArray();
        int result = 0;
        int count = 0;
        for (char c : charArray) {
            if(c == 'A') {
                count++;
            } else if(c == 'G') {
                result += count;
            }
        }
        return result;
    }
}
