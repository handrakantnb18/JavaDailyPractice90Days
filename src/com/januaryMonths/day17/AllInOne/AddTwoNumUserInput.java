package com.januaryMonths.day17.AllInOne;

import java.util.Scanner;

public class AddTwoNumUserInput {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number : ");
        x = scanner.nextInt();

        System.out.println("Type anather number : ");
        y = scanner.nextInt();

        sum = x + y;
        System.out.println("Sum of : " + sum);
    }
}
