package com.januaryMonths.day2;

// boolean data type check true or false
public class OperBoole {
    public static void main(String[] args) {
        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Regular user: "+ (isLoggedIn && !isAdmin));
        System.out.println("Has Access: "+ (isLoggedIn || isAdmin));
        System.out.println("Not logged in :"+ isAdmin);
        System.out.println("Not logged in :"+ !isLoggedIn);
    }
}
