package com.januaryMonths.day4;

public class JavaMethodOverloading {
    static int plusMethod(int a, int b){
        return a + b;
    }

    static double doubleMethod (double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        int plm = plusMethod(45, 56);
        double dlm = doubleMethod(78, 89);

        System.out.println("Int Number : " +plm);
        System.out.println("Double Number : " +dlm);
    }
}
