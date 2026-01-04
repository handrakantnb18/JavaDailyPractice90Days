package com.januaryMonths.day2;

// string check toLowerCase, toUpperCase, length, repeat, charAt
public class StrLength {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str1 = "chandraknt bhosle";
        System.out.println("The Length of String: " +str.length());
        System.out.println("Repeat of String: "+str.repeat(1));
        System.out.println(str.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.charAt(2));
        System.out.println(str1.charAt(9));
    }
}
