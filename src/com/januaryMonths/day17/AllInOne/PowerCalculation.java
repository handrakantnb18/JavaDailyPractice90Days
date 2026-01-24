package com.januaryMonths.day17.AllInOne;

public class PowerCalculation {

    static int power(int N, int P) {
        if (P == 0)
            return 1;
        else
            return N * power(N, P - 1);
    }

    static int power1(int A, int B) {
        int pow = 1;
        for (int i = 0; i <= B; i++)
            pow *= A;
        return pow;

    }

    public static void main(String[] args) {
        int N = 2;
        int P = 3;
        System.out.println(power(N, P));

        int A = 4;
        int B = 5;
        System.out.println(power1(A, B));


    }
}
