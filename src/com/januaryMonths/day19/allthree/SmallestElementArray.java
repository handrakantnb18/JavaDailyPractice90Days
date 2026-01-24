package com.januaryMonths.day19.allthree;

public class SmallestElementArray {
    public static void main(String[] args) {
        int a[] = {20, 12, 15, 18, 50, 56, 23, 10, 45, 30, 24};

        int lowestAge = a[0];

        for (int age : a) {
            if (lowestAge > age) {
                lowestAge = age;
            }
        }
        System.out.println("The lowest age in the array is  : "+ lowestAge);
    }
}
