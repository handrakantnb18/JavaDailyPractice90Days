package com.januaryMonths.day18.AllIntwo;

public class CheckArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int result = 0;
        int digit = String.valueOf(num).length();

        while (num != 0) {
            int digits = num % 10;
            result += Math.pow(digits, digit );
            num /= 10;
        }
        System.out.println(original + (result == original ? " Is armstrong " : " is nor Armstrong "));

    }
}
