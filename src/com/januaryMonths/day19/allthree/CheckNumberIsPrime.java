package com.januaryMonths.day19.allthree;

public class CheckNumberIsPrime {
    public static void main(String[] args) {
        int num = 99;
        boolean isPrime = num > 1;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0 ) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? " is prime ": " is not prime");
    }
}
