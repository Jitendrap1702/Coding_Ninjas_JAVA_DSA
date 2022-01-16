package com.company.Codechef.NovemberLongChallenge;

import java.util.Scanner;

public class EqualCoin {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                if ((x + (y*2)) % 2 != 0){
                    System.out.println("NO");
                }else {
                    System.out.println("YES");
                }
            }
        }catch (Exception e){ }
    }
}
