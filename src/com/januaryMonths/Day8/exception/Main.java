package com.januaryMonths.Day8.exception;

public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[9]);
            int result = 10 /0;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index does not exits...");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divide by zero...");
        }
        catch (Exception e)
        {
            System.out.println("Something else went wrong...");
        }
    }
}
