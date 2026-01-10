package com.januaryMonths.day7.error;

public class CheckVarValue {
    public static void main(String[] args) {
        int age = 19;
        System.out.println("Age : " +age);

        if (age >= 18) {
            System.out.println("Access granted...");
        }else {
            System.out.println("Access Denied...");
        }
    }
}
