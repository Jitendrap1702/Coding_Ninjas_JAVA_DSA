package com.company.Codechef.FebruaryLongChallenge2;

import java.util.Scanner;

public class ChefAndNextGen {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();

                String ans = a * b <= x * y ? "YES" : "NO";
                System.out.println(ans);
            }
        }catch (Exception e){}
    }
}
