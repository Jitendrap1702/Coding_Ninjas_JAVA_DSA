package com.company.Codechef.January2021LongChallenge2;

import java.util.Scanner;

public class TCSExamination {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int dsa1 = sc.nextInt();
                int toc1 = sc.nextInt();
                int dm1 = sc.nextInt();
                int dsa2 = sc.nextInt();
                int toc2 = sc.nextInt();
                int dm2 = sc.nextInt();

                if ((dsa1 + toc1 + dm1) > (dsa2 + toc2 + dm2)) {
                    System.out.println("Dragon");
                } else if ((dsa1 + toc1 + dm1) < (dsa2 + toc2 + dm2)) {
                    System.out.println("Sloth");
                } else {
                    if (dsa1 > dsa2) {
                        System.out.println("Dragon");
                    } else if (dsa1 < dsa2) {
                        System.out.println("Sloth");
                    } else {
                        if (toc1 > toc2) {
                            System.out.println("Dragon");
                        } else if (toc1 < toc2) {
                            System.out.println("Sloth");
                        } else {
                            if (dm1 > dm2) {
                                System.out.println("Dragon");
                            } else if (dm1 < dm2) {
                                System.out.println("Sloth");
                            } else {
                                System.out.println("Tie");
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {

        }
    }
}
