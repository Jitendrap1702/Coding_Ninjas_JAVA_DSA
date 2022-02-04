package com.company.Codechef.FebruaryLongChallenge1;

import java.util.Scanner;

public class BinaryBaseBasics {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                String s = sc.next();

                int mid = n / 2;
                int x = 0, y = n-1;
                int reqNoOfFlips = 0;
                while (x < mid) {
                    if (s.charAt(x) != s.charAt(y)) {
                        reqNoOfFlips++;
                    }
                    x++;
                    y--;
                }
                if (reqNoOfFlips <= k && (k-reqNoOfFlips)%2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }catch (Exception e){}
    }
}
