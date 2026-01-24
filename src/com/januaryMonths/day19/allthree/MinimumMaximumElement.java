package com.januaryMonths.day19.allthree;

public class MinimumMaximumElement {
    public static void main(String[] args) {
        int[] num = {45 , 12, 65, 78, 25, 3, 25};

        int max = num[0];
        int min = num[0];

        for (int n : num) {
            if (n > max) {
                max = n;
            }
            if (n < min)
            {
            min = n;
            }
        }
        System.out.println("Max : " +max);
        System.out.println("Min : " + min);
    }
}
