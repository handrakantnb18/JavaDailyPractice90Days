package com.januaryMonths.day18.AllIntwo;

public class ReverseString {
    public static void main(String[] args) {
        String original = "Chandrakant bhosale";
        String reverseStr = " ";

        for (int i = 0; i < original.length(); i++) {
            reverseStr = original.charAt(i) + reverseStr;
        }

        System.out.println("Reversed String : " + reverseStr);
    }
}
