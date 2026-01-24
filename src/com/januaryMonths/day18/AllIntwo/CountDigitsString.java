package com.januaryMonths.day18.AllIntwo;

public class CountDigitsString {
    public static void main(String[] args) {
        String a = "iijfco oiiujhf 546 45984 67859 ioijcfio 849684 vfgreouiuifedufh 44894 kjjcvj 44848 ";
        int count = 0;

        for (char c : a.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        System.out.println("Digits : " + count);
    }
}
