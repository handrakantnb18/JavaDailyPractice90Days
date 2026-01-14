package com.januaryMonths.Day8.exception;

public class MultiCatchException {
    public static void main(String[] args) {
        try {
            int result = 10/0;
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(numbers[10]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Math error divide by zero");
        }
    }
}
