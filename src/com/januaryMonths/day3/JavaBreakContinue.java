package com.januaryMonths.day3;

public class JavaBreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++){
            if (i == 4)
            {
                continue;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++)
        {
            if (i == 2){
                continue;
            }
            if (i == 3 ) {
                break;
            }
            System.out.println(i);
        }
    }
}
