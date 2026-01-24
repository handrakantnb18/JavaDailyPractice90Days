package com.januaryMonths.day19.allthree;

public class SecondLargestArray {
    public static void main(String[] args) {
        int[] nums = {12, 5, 6, 88, 45, 56};
        Integer first = null, second = null;

        for (int n : nums) {
            if (first == null || n > first) {
                second = first;
                first = n;
            }
            else if ((second == null || n > second) && n != first) {
                second = n;
            }
        }

        if (second != null) {
            System.out.println("Secod largest Number : " +second);
        }
        else {
            System.out.println("No distinct second largest value.");
        }
    }
}
