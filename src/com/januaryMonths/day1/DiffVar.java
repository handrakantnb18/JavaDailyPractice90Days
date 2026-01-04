package com.januaryMonths.day1;

// different primitive DataTypes
public class DiffVar {
    public static void main(String[] args) {
        int items = 50;
        float items2 = 10.10f;
        float total = items + items2;
        char currency = '$';

        System.out.println("Number of paramiters: "+ items);
        System.out.println("Cost per items: "+ items2 + currency);
        System.out.println("Total cost: "+ total + currency);
    }
}
