package com.company.Codechef.January2021LongChallenge1;

import java.util.Scanner;

public class ReverseBackTheArray {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int x = sc.nextInt();
                findArray(n, x);
                System.out.println();
            }
        }catch (Exception e){ }
    }

    static void findArray(int N, int K)
    {

        if (N == 1)
        {
            System.out.print(K + " ");
            return;
        }

        // Assign values to P and Q
        int P = 2*N-1;
        int Q = N-1;

        if (N == 2)
        {
            System.out.print(P + " " + Q);
            return;
        }

        // Stores Bitwise XOR of the
        // first (N - 3) elements
        int VAL = 0;

        // Print the first N - 3 elements
        for(int i = 1; i <= (N - 3); i++)
        {
            System.out.print(i + " ");

            // Calculate Bitwise XOR of
            // first (N - 3) elements
            VAL ^= i;
        }

        if (VAL == K)
        {
            System.out.print(P + " " +
                    Q + " " + (P ^ Q));
        }
        else
        {
            System.out.print(0 + " " +
                    P + " " +
                    (P ^ K ^ VAL));
        }
    }
}
