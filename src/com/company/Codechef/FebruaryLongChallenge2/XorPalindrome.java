package com.company.Codechef.FebruaryLongChallenge2;

import java.util.Scanner;

public class XorPalindrome {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {

                int n = sc.nextInt();
                String s = sc.next();
                int ones = 0, zeros = 0;
                for (int j = 0; j < n; j++) {
                    if (s.charAt(j) == '0') {
                        zeros++;
                    } else {
                        ones++;
                    }
                }

                if (n%2 == 0){
                    if (zeros == ones){
                        System.out.println("YES");
                    }else if (zeros%2==0 && ones%2==0){
                        System.out.println("YES");
                    }else {
                        System.out.println("NO");
                    }
                }else {
                    System.out.println("YES");
                }
            }
        }catch (Exception e){}
    }
}
