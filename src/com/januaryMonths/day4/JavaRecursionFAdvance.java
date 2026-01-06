package com.januaryMonths.day4;

public class JavaRecursionFAdvance {
    static void contdown(int n) {
        if (n > 0) {
            System.out.println(n + " ");
            contdown(n - 1);
        }
    }
    public static void main(String[] args) {
        contdown(5);
    }
}
