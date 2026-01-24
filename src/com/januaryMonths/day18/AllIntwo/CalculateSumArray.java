package com.januaryMonths.day18.AllIntwo;

public class CalculateSumArray {
    public static void main(String[] args) {
        int[] arr= {1, 5, 10, 25};
        int sum = 0;
        int i;

        for (i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        System.out.println("The sum of : " +sum);
    }
}
