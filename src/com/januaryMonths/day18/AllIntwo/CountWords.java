package com.januaryMonths.day18.AllIntwo;

public class CountWords {
    public static void main(String[] args) {
        String words = "Chandrakant bhosale sangli";
        int countWord = words.split("\\s").length;
        System.out.println(countWord);

    }
}
