package com.company.Codechef.JanuaryLongChallenge;

import java.util.Scanner;

public class CovidSpread {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {

                int n = sc.nextInt();
                int d = sc.nextInt();
                int infected = 1; // when d == 0
                if (d <= 10) {
                    infected = (int) Math.pow(2, d);
                }else{ // when d > 10
                    infected = (int) (Math.pow(2, 10) * Math.pow(3, (d - 10)));
                }

                if (infected > n) {
                    System.out.println(n);
                } else {
                    System.out.println(infected);
                }
            }
        }catch (Exception e){

        }
    }
}
