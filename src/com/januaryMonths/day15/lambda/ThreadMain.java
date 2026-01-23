package com.januaryMonths.day15.lambda;

public class ThreadMain extends Thread {
    public static void main(String[] args) {
       ThreadMain tm = new ThreadMain();
           tm.start();
        System.out.println("Outside of threads");

    }
    public void run() {
        System.out.println("Thread is running..");
    }
}
