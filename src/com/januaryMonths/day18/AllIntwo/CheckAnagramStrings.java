package com.januaryMonths.day18.AllIntwo;

import java.util.Arrays;

public class CheckAnagramStrings {
    public static void main(String[] args) {
        String s1 = "bhosale";
        String s2 = "chandrakant";

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnagram = Arrays.equals(arr1, arr2);
        System.out.println(isAnagram ? "Anagram" : "Not Anagram");
    }
}
