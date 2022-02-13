package com.company.Codechef.FebruaryLongChallenge2;

import java.util.Scanner;

public class XorPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){

            int n = sc.nextInt();
            String s = sc.next();
            int ones = 0, zeros = 0;
            for (int j = 0; j < n; j++){
                if (s.charAt(j) == '0'){
                    zeros++;
                }else {
                    ones++;
                }
            }

            if ((zeros%2==0 && ones%2!=0) || (zeros%2!=0 && ones%2==0)){
                System.out.println("YES");
            }
            else if (zeros%2 != 0 || ones%2 != 0){
                System.out.println("NO");
            }
        }
    }
}
