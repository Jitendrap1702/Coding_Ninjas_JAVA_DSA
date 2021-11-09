package com.company.Codechef.SnackDown2021.Rund1B;

import java.util.Scanner;

public class QueensReplacement {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int cases = sc.nextInt();
            for (int i = 0; i < cases; i++) {
                int n = sc.nextInt();

                for (int j = 0; j < n - 3; j++) {

                    for (int k = 0; k < n; k++) {

                        if (j == k) {
                            System.out.print("Q");
                        } else {
                            System.out.print(".");
                        }
                    }
                    System.out.println();
                }
                for (int x = 0; x < 3; x++) {

                    for (int y = 0; y < n; y++) {

                        if (x == 1 && y == n - 2) {
                            System.out.print("Q");
                        } else {
                            System.out.print(".");
                        }
                    }
                    System.out.println();
                }
            }
        } catch (Exception e) {

        }

    }
}
