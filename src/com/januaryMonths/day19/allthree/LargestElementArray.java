package com.januaryMonths.day19.allthree;

public class LargestElementArray {
    public static void main(String[] args) {
        int[] num = {12, 8, 22, 56, 99, 45, 1};
        int largest = num[0];

        for (int n : num) {
            if (n > largest) {
                largest = n;
            }
        }
        System.out.println("Largest Elemeents : " +largest);
    }
}
