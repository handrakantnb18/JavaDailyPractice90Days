package com.januaryMonths.generics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsMain {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Chandrakant", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Bhosale");
        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("Match found");
        }
        else {
            System.out.println("Match not found");
        }

    }
}
