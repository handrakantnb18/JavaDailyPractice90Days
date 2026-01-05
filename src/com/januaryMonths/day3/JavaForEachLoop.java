package com.januaryMonths.day3;

public class JavaForEachLoop {
    public static void main(String[] args) {
        String[] froots = {"banana", "mango", "apple", "graps"};

        for (String froot : froots) {
            System.out.println(froot);
        }

        int[] empid = {101, 102, 103, 104, 105};

        for (int emp : empid) {
            System.out.println(emp);
        }
    }
}
