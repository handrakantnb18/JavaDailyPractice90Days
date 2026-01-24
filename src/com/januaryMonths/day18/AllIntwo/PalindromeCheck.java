package com.januaryMonths.day18.AllIntwo;

public class PalindromeCheck {
    public static void main(String[] args) {
        String t = "level";
        boolean isPaiandrome = true;

        for (int i = 0; i < t.length() / 2; i++) {
            if (t.charAt(i) != t.charAt(t.length() - 1 - i)) {
                isPaiandrome = false;
                break;
            }

        }
        if (isPaiandrome) {
            System.out.println(t + " is a paliondrome number.");
        }
        else {
            System.out.println(t + " is a not paliondrome number.");
        }
    }


}
