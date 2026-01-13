package com.januaryMonths.day7.error;

public class ThrowKeywordException {
    static void checkAge(int age) {
        if (age > 18) {
            throw new RuntimeException("Access dinied");
        }
        else {
            System.out.println("Access granted...");
        }
    }
    public static void main(String[] args) {
        checkAge(15);
    }
}
