package com.company.Codechef.JanuaryLongChallenge;

import java.util.Scanner;

public class KeplersLaw {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {

                int t1 = sc.nextInt();
                int t2 = sc.nextInt();
                int r1 = sc.nextInt();
                int r2 = sc.nextInt();

                double x1 = (float) Math.pow(t1, 2) / Math.pow(r1, 3);
                double x2 = (float) Math.pow(t2, 2) / Math.pow(r2, 3);
                if (x1 == x2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        } catch (Exception e) {

        }
    }
}
