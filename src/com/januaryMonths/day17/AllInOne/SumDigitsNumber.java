package com.januaryMonths.day17.AllInOne;

public class SumDigitsNumber {
    public static void main(String[] args) {
        int n = 352;
        int sum = 0;

        while (n > 0){
            sum += n % 10;
            n += 10;
        }
        System.out.println("Sum of the digits : " +sum);
    }
}
