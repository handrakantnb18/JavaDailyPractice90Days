package com.januaryMonths.day18.AllIntwo;

public class CountVowels {
    public static void main(String[] args) {
        String text = "Chandrakant bhosale";
        int count = 0;

        for (char c : text.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println("Vowels : "+count);
    }
}
