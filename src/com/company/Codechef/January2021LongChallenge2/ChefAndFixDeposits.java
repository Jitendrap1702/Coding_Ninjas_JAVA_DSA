package com.company.Codechef.January2021LongChallenge2;

import java.util.Arrays;
import java.util.Scanner;

// Not the correct one
public class ChefAndFixDeposits {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {

                int n = sc.nextInt();
                int x = sc.nextInt();
                int[] a = new int[n];
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    a[j] = sc.nextInt();
                    sum += a[j];
                }
                Arrays.sort(a);

                int count = 0;
                if (sum < x) {
                    System.out.println(-1);
                } else {
                    int z = n - 1;
                    while (x > 0) {
                        x = x - a[z];
                        z--;
                        count++;
                    }
                    System.out.println(count);
                }
            }
        } catch (Exception e) {
        }
    }
}
