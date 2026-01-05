package com.januaryMonths.day3;

public class BooleanCheck {
    public static void main(String[] args) {
        System.out.println("Hello world");

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);

        int x = 10;
        int y = 20;
        System.out.println(x > y);
        System.out.println(x < y);

        int myAge = 25;
        int votingAge = 18;

        System.out.println(myAge > votingAge);

        if (myAge >= votingAge) {
            System.out.println("Voting is allow. ");
        }else {
            System.out.println("Voting not allow. ");
        }
    }
}
