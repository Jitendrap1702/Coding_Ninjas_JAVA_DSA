package com.company.Codechef.January2021LongChallenge2;

import java.util.Scanner;

public class CryingColours {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();

                int r1 = sc.nextInt();
                int g1 = sc.nextInt();
                int b1 = sc.nextInt();

                int r2 = sc.nextInt();
                int g2 = sc.nextInt();
                int b2 = sc.nextInt();

                int r3 = sc.nextInt();
                int g3 = sc.nextInt();
                int b3 = sc.nextInt();

                //System.out.println((int) (3*n - (r1 + g2 + b3)) / 2);
                int count = 0;
                while (g1 != 0 && r2 != 0){
                    count++;
                    g1--;
                    r2--;
                    r1++;
                    g2++;
                }

                while (b1 != 0 && r3 != 0){
                    count++;
                    r1++;
                    r3--;
                    b3++;
                    b1--;
                }

                while (g3 != 0 && b2 != 0){
                    count++;
                    g3--;
                    g2++;
                    b2--;
                    b3++;
                }

                System.out.println(count);
            }
        }catch (Exception e){}
    }
}
