package com.januaryMonths.day3;

public class JavaMultidiamentionalArray {
    public static void main(String[] args) {
        int[][] numbers = {{1, 4, 7}, {2, 5, 8}};
        System.out.println(numbers[1][1]);

        int [][] num = {{3, 6, 9},{2, 4, 8}};
        num[1][2] = 9;
        System.out.println(num[1][2]);
    }
}
