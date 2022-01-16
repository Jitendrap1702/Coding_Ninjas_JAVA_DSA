package com.company.Codechef.JanuaryLongChallenge;

import java.util.Scanner;

public class PrimeInABinaryString {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                isPrimeSubstringPresent(s);
            }
        }catch (Exception e){}
    }

    public static void isPrimeSubstringPresent(String s){
        int len = s.length();
        if (len == 1){
            System.out.println("NO");
            return;
        }
        // if substring = "11" or "10" then it will be prime
        if (len >= 2) {
            for (int j = 1; j < len; j++) {
                if (s.charAt(j - 1) == '1' && s.charAt(j) == '1') {
                    System.out.println("YES");
                    return;
                }
                if (s.charAt(j - 1) == '1' && s.charAt(j) == '0') {
                    System.out.println("YES");
                    return;
                }
            }
        }

        // if substring = "101" then it will be prime
        // Note :- "011" & "111" checked in length 2 so no need to check again
        if (len >= 3) {
            for (int j = 2; j < len; j++) {
                if (s.charAt(j-2) == '1' && s.charAt(j-1) == '0' && s.charAt(j) == '1'){
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");
    }
}
