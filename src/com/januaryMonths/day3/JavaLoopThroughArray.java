package com.januaryMonths.day3;

public class JavaLoopThroughArray {
    public static void main(String[] args) {
        String[] name = {"Chandrakant", "Priyanka", "Sachin", "Vijay", "Subhash"};

        for (int i = 0; i < name.length; i++)
        {
            System.out.println(name[i]);
        }

        int[] num = {15, 25, 35, 45, 55, 65};

        for (int i =0; i < num.length; i++){
            System.out.println(num[2]);
        }

        int sum = 0;

        for (int j = 0; j < num.length; j++){
            sum += num[j];
            System.out.println("Sum : "+sum);
        }
    }
}
