package com.arrays.prefixsum;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllSubarrays {

    public static void main(String[] args) {
        System.out.println(subarrays(List.of(1, 2, 3)));
        System.out.println("-----------------------------");
        System.out.println(subarrays(List.of(5, 2, 1, 4)));
    }

    public static List<List<Integer>> subarrays(List<Integer> A) {
        List<List<Integer>> res = new ArrayList<>();
        for (int x = 0; x < A.size(); x++) {
            for (int y = x; y < A.size(); y++) {
                List<Integer> subarray = new ArrayList<>();
                for (int i = x; i <= y; i++) {
                    subarray.add(A.get(i));
                }
                res.add(subarray);
            }
        }
        return res;
    }
}
