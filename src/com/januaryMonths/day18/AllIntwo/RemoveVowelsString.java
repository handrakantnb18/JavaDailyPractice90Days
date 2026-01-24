package com.januaryMonths.day18.AllIntwo;

public class RemoveVowelsString {
    public static void main(String[] args) {
        String txt = "chandrakant bhosale";
        String result = txt.replaceAll("[aeiouAEIOU]", " ");

        System.out.println(result);
    }
}
