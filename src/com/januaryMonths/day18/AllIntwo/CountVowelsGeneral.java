package com.januaryMonths.day18.AllIntwo;

import java.util.HashSet;
import java.util.Set;

public class CountVowelsGeneral {
    public static void main(String[] args) {
        String text = "Chandraaknt bhosale";
        Set<Character> vo = new HashSet<>();

        for (char v : new char[] {'a', 'e', 'i', 'o', 'u'}) {
            vo.add(v);
        }

        int count = 0;
        for (char c : text.toLowerCase().toCharArray()) {
            if (vo.contains(c)) {
                count++;
            }

            System.out.println("Vowels : " + count);
        }

    }
}
