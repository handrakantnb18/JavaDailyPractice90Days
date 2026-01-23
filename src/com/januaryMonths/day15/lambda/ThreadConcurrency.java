package com.januaryMonths.day15.lambda;

public class ThreadConcurrency extends Thread{
    public static int amount = 0;

    public static void main(String[] args) {
        ThreadConcurrency tc = new ThreadConcurrency();
        tc.start();;
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
}
