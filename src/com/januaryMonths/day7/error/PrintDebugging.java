package com.januaryMonths.day7.error;

public class PrintDebugging {
    public static void main(String[] args) {
        int a= 10;
        int b = 0;

        System.out.println("Before division...");

        int result = a / b;
        System.out.println("Result : "+result);
    }
}
