package com.januaryMonths.day18.AllIntwo;

public class RemoveAllWhitespace {
    public static void main(String[] args) {
        String t = "    java \t is    \n   fun   ";

        String noSpace  = t.replaceAll("\\s+", " ");

        System.out.println(noSpace);
    }
}
