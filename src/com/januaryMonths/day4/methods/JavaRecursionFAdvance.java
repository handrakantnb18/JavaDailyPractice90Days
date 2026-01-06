package com.januaryMonths.day4.methods;

public class JavaRecursionFAdvance {
    static void contdown(int n) {
        if (n > 0 && n > 1) {
            //return n * contdown(n - 1);
            System.out.println(n + " ");
            contdown(n - 1);
        }else {
                // return 1;
        }
    }
    public static void main(String[] args) {
        contdown(5);
    }
}
