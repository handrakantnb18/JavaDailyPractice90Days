package com.januaryMonths.day15.lambda;

public class ThreadConcurrIsAlive extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        ThreadConcurrIsAlive thread = new ThreadConcurrIsAlive();
        thread.start();

        while (thread.isAlive()) {
            System.out.println("Waiting...");
        }

        System.out.println("Main Class : " + amount);
        amount++;
        System.out.println("Main Class : " +amount);
    }
    public void run() {
        amount++;
    }
}
