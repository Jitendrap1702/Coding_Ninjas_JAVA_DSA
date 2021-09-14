package com.company;

import java.util.Scanner;

public class CountAlteringParity {

    static int countPairs(
            int[] A, int n)
    {
        int count = 0, i, j;

        // Generate all possible pairs
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {

                // Increment the count if
                // both even or both odd
                if ((A[i] % 2 == 0
                        && A[j] % 2 == 0)
                        || (A[i] % 2 != 0
                        && A[j] % 2 != 0))
                    count++;
            }
        }
        return count;
    }

    // Driver Code
    public static void main(
            String[] args)
    {
        int[] A = { 1, 2, 1, 2, 1 };
        int n = A.length;
        System.out.println(
                countPairs(A, n));
    }
}
