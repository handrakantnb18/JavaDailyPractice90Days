package com.januaryMonths.day4;

public class JavaRecursionFunction {
    public static int sum(int k, int start, int end) {
        if (k > 0) {
            return k + sum(k - 1, start, end - 1);
        }else {
            return  end;
        }

//        if (end > start) {
//            return end + sum(start, end - 1);
//        }else {
//            return end;
//        }
    }
    public static void main(String[] args) {
        int result = sum(10, 5, 15);
        System.out.println(result);
    }
}
