package com.januaryMonths.day4;

public class JavaMethodParameterValue {
    static int num(int a, int b) {
        return  a + b;
    }
    public static void main(String[] args) {
        int c = num(4, 6);
        System.out.println(num(8, 7));
        System.out.println(c);
    }
}
