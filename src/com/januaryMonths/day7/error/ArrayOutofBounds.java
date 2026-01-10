package com.januaryMonths.day7.error;

public class ArrayOutofBounds {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 9, 3, 7, 6, 4};
        System.out.println(numbers[10]);
    }
}
