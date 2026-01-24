package com.januaryMonths.day19.allthree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArrays {
    public static void main(String[] args) {
        Integer[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Set<Integer> unique = new HashSet<>(Arrays.asList(num));

        System.out.println(unique);
    }
}
