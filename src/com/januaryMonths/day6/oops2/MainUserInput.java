package com.januaryMonths.day6.oops2;

import java.util.Scanner;

public class MainUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User_Name : ");

        String userName = scanner.nextLine();
        System.out.println("UserName : " + userName);
    }
}