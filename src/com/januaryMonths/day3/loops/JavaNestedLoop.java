package com.januaryMonths.day3.loops;

public class JavaNestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j +" ");
            }
            System.out.println();
        }
    }
}
