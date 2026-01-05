package com.januaryMonths.day3;

public class LogicalOperator {
    public static void main(String[] args) {
        // && operator

        int num1 = 100;
        int num2 = 200;
        int num3 = 300;

        if (num1 > num2 && num3 > num1){
            System.out.println("Both condition are true...");
        }else {
            System.out.println("Both condition are false..");
        }
    }
}
