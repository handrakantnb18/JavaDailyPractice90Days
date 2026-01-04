package com.januaryMonths.day2;

// comparing two values its boolean true or false

public class StrCompareToChar {
    public static void main(String[] args) {
        String str1 = "bhosale";
        String str2 = "bhosale";

        String str3 = "chandrakant";
        String str4 = "bhosale";

        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str4));

        System.out.println(str1 == str2);
        System.out.println(str3 == str4);
        System.out.println(str3 != str4);
    }
}
