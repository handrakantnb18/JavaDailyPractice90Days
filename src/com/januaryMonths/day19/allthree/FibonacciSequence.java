package com.januaryMonths.day19.allthree;

public class FibonacciSequence {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, count = 10;

        System.out.println("Fabonacci series : " +num1 + " " + num2);

        for (int i = 2; i < count; i++) {
            int num3 = num1 + num2;

            System.out.println(" " +num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
