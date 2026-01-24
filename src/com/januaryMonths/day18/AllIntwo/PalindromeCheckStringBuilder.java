package com.januaryMonths.day18.AllIntwo;

public class PalindromeCheckStringBuilder {
    public static void main(String[] args) {
        String t = "level";
        String reversed = new  StringBuilder(t).reverse().toString();

        if (t.equalsIgnoreCase(reversed)) {
            System.out.println(t + " is a paliondrom.");
        }
        else {
            System.out.println(t + "is not paliondrome");
        }
    }
}
