package com.company.Codechef;

import java.util.Scanner;

public class VedantAndHisHiddenArray {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int a = sc.nextInt();

                if (n == 1) {
                    if (a % 2 == 0) {
                        System.out.println("even");
                    } else {
                        System.out.println("odd");
                    }
                } else if (n % 2 == 0 && a == 1) {
                    System.out.println("even");
                } else if (n % 2 != 0 && a == 1) {
                    System.out.println("odd");
                } else if (n > 2 && a == 0) {
                    System.out.println("even");
                } else if (n == 2 && a % 2 != 0) {
                    System.out.println("even");
                } else {
                    System.out.println("Impossible");
                }
            }
        } catch (
                Exception e) {
        }
    }
}
